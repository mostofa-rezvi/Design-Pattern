package records.prototype;

import records.PatientRecord;
import records.departments.CardiologyRecord;
import records.departments.DermatologyRecord;
import records.departments.NeurologyRecord;
import records.departments.OrthopedicsRecord;

import java.util.HashMap;
import java.util.Map;

public class RecordRegistry {
    private final Map<String, PatientRecord> registry = new HashMap<>();

    public RecordRegistry() {
        this.registerRecord("cardiology", new CardiologyRecord());
        this.registerRecord("neurology", new NeurologyRecord());
        this.registerRecord("orthopedics", new OrthopedicsRecord());
        this.registerRecord("dermatology", new DermatologyRecord());
    }

    public void registerRecord(String key, PatientRecord record) {
        registry.put(key.toLowerCase(), record);
    }

    public PatientRecord getRecord(String key) {
        PatientRecord template = registry.get(key.toLowerCase());
        return (template != null) ? template.clone() : null;
    }
}