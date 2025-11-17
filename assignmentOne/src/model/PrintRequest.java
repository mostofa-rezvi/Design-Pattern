package model;

import printjob.modes.strategies.ColorBoostingStrategy;
import printjob.modes.strategies.PageSavingStrategy;
import printjob.modes.strategies.TonerSavingStrategy;

import java.util.ArrayList;
import java.util.List;

public class PrintRequest {
    private final Document document;
    private final PrintSettings printSettings;
    private final List<Object> modes;

    public PrintRequest(Document document, PrintSettings printSettings) {
        this.document = document;
        this.printSettings = printSettings;
        this.modes = new ArrayList<>();
    }

    public void addMode(Object mode) {
        if (mode instanceof TonerSavingStrategy || mode instanceof PageSavingStrategy || mode instanceof ColorBoostingStrategy) {
            modes.add(mode);
        }
    }

    public Document getDocument() {
        return document;
    }

    public PrintSettings getPrintSettings() {
        return printSettings;
    }

    public void applyModes() {
        System.out.println("\nProcessing request for document: \"" + document.getContent().substring(0, 20) + "...\"");
        System.out.println("Initial Settings: " + printSettings);
        for (Object mode : modes) {
            if (mode instanceof TonerSavingStrategy) {
                ((TonerSavingStrategy) mode).saveToner(printSettings);
            }
            if (mode instanceof PageSavingStrategy) {
                ((PageSavingStrategy) mode).savePage(printSettings);
            }
            if (mode instanceof ColorBoostingStrategy) {
                ((ColorBoostingStrategy) mode).boost(printSettings);
            }
        }
        for (Object mode : modes) {
            if (mode instanceof PageSavingStrategy) {
                ((PageSavingStrategy) mode).renderPreview(document);
            }
        }
        System.out.println("Final Settings:   " + printSettings);
    }
}