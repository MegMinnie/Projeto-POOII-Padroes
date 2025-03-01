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

     
        StringBuilder json = new StringBuilder();
        json.append("{ \"data\": {");

        
        Pattern pattern = Pattern.compile("<(.*?)>(.*?)</\\1>");
        Matcher matcher = pattern.matcher(xml);

        boolean firstElement = true;

        while (matcher.find()) {
            if (!firstElement) {
                json.append(", ");
            }
            json.append("\"").append(matcher.group(1)).append("\": \"").append(matcher.group(2)).append("\"");
            firstElement = false;
        }

        json.append("} }");
        return json.toString();
    }
}
