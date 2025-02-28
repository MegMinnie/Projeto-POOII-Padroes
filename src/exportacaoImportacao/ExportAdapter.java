package src.exportacaoImportacao;

import java.util.ArrayList;

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
        return xml
            .replace("<?xml version=\"1.0\"?>", "")
            .replace("<data>", "{ \"data\": {")
            .replace("</data>", "} }")
            .replace("<" + tag + ">", "{ \"" + tag + "\": {")
            .replace("</" + tag + ">", "} }")
            .replaceAll("<(.*?)>(.*?)</(.*?)>", "\"$1\": \"$2\"")
            .trim();
    }
}
