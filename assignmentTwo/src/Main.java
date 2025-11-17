import factory.DepartmentRecordFactory;
import factory.RecordFactory;
import records.builder.DetailedRecordBuilder;
import records.builder.SummaryRecordBuilder;
import records.prototype.RecordRegistry;
import service.PatientRecordService;

public class Main {
    public static void main(String[] args) {
        RecordRegistry registry = new RecordRegistry();
        RecordFactory factory = new DepartmentRecordFactory(registry);
        PatientRecordService service = new PatientRecordService(factory);

        System.out.println("--- Generating DETAILED Patient Records ---");

        service.generateRecord("cardiology", "Rahim", new DetailedRecordBuilder());

        service.generateRecord("neurology", "Karim", new DetailedRecordBuilder());

        service.generateRecord("dermatology", "Fatima", new DetailedRecordBuilder());

        System.out.println("\n--- Generating SUMMARY Patient Records ---");

        service.generateRecord("orthopedics", "Jamal", new SummaryRecordBuilder());
        service.generateRecord("cardiology", "Aisha", new SummaryRecordBuilder());

        System.out.println("\n--- Testing Error Handling ---");
        service.generateRecord("oncology", "John Doe", new DetailedRecordBuilder());
    }
}