import model.Document;
import model.PrintRequest;
import model.PrintSettings;
import printjob.PrintJob;
import printjob.modes.BoosterMode;
import printjob.modes.PageSaveMode;
import printjob.modes.TonerSaveMode;
import printjob.priority.FifoPriority;
import printjob.priority.LifoPriority;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new Document("This is the first document with important business content.");
        Document doc2 = new Document("This is the second, much longer document containing various images and text.");
        Document doc3 = new Document("A final, short document for quick printing.");

        PrintSettings settings1 = new PrintSettings(15, "A4", "Portrait", 80.0, 0.1);
        PrintSettings settings2 = new PrintSettings(50, "Letter", "Landscape", 70.0, 0.08);
        PrintSettings settings3 = new PrintSettings(5, "A5", "Portrait", 95.0, 0.12);

        PrintRequest request1 = new PrintRequest(doc1, settings1);
        request1.addMode(new TonerSaveMode(TonerSaveMode.TonerSavingLevel.HIGH));

        PrintRequest request2 = new PrintRequest(doc2, settings2);
        request2.addMode(new PageSaveMode());
        request2.addMode(new TonerSaveMode(TonerSaveMode.TonerSavingLevel.MEDIUM));

        PrintRequest request3 = new PrintRequest(doc3, settings3);
        request3.addMode(new BoosterMode(100.0));

        PrintJob printManager = new PrintJob(new FifoPriority());

        printManager.addJob(request1);
        printManager.addJob(request2);
        printManager.addJob(request3);

        printManager.pullJob();
        printManager.pullJob();

        printManager.changePriority(new LifoPriority());
        printManager.pullJob();
        printManager.pullJob();
    }
}