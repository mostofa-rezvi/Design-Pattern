package printjob.modes.strategies;

import model.Document;
import model.PrintSettings;

public interface PageSavingStrategy {
    void savePage(PrintSettings settings);

    void renderPreview(Document document);
}