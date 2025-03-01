package src.exportacaoImportacao;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExportAdapter {
    private ExportData exportData;

    public ExportAdapter(ExportData exportData) {
        this.exportData = exportData;
    }

    public String convertToJson(ArrayList<String[]> data, int multipler, String tag) {
        String xml = exportData.ArrayToXMLFormat(data, multipler, tag);
        return xmlToJson(xml, tag);
    }

    private String xmlToJson(String xml, String tag) {
       
        xml = xml.trim();
        if (xml.startsWith("<?xml")) {
            xml = xml.substring(xml.indexOf("?>") + 2).trim();
        }
        
       
        Pattern studentPattern = Pattern.compile("<" + tag + ">(.*?)(?=<" + tag + ">|$)", Pattern.DOTALL);
        Matcher studentMatcher = studentPattern.matcher(xml);
        
        StringBuilder json = new StringBuilder();
        json.append("{ \"data\": { \"data\": [");
        
        boolean firstStudent = true;
        
        while (studentMatcher.find()) {
            String studentBlock = studentMatcher.group(1).trim();
           
            if (studentBlock.isEmpty()) continue;
            
          
            Pattern fieldPattern = Pattern.compile("<(\\w+)>(.*?)</\\1>", Pattern.DOTALL);
            Matcher fieldMatcher = fieldPattern.matcher(studentBlock);
            
            StringBuilder studentJson = new StringBuilder();
            studentJson.append("{");
            boolean firstField = true;
            
            while (fieldMatcher.find()) {
                if (!firstField) {
                    studentJson.append(", ");
                }
                String key = fieldMatcher.group(1).trim();
                String value = fieldMatcher.group(2).trim();
                studentJson.append("\"").append(key).append("\": \"")
                           .append(value.replace("\"", "\\\"")).append("\"");
                firstField = false;
            }
            studentJson.append("}");
            
            if (!firstStudent) {
                json.append(", ");
            }
            json.append(studentJson.toString());
            firstStudent = false;
        }
        
        json.append("] } }");
        return json.toString();
    }
    
    
    
}