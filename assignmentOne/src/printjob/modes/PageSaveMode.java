package printjob.modes;

import model.Document;
import model.PrintSettings;
import printjob.modes.strategies.PageSavingStrategy;

public class PageSaveMode implements PageSavingStrategy {
    @Override
    public void savePage(PrintSettings settings) {
        int originalPages = settings.getNumberOfPages();
        int reducedPages = (int) Math.ceil(originalPages * 0.8);
        settings.setNumberOfPages(reducedPages);
        System.out.println("PageSaveMode: Number of pages reduced from " + originalPages + " to " + reducedPages + ".");
    }

    @Override
    public void renderPreview(Document document) {
        System.out.println("PageSaveMode Preview: Displaying preview of updated document...");
        System.out.println(document.getContent().substring(0, Math.min(document.getContent().length(), 50)) + "...");
    }
}