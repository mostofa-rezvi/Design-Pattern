package factory;

import records.PatientRecord;
import records.prototype.RecordRegistry;

public class DepartmentRecordFactory implements RecordFactory {
    private final RecordRegistry registry;

    public DepartmentRecordFactory(RecordRegistry registry) {
        this.registry = registry;
    }

    @Override
    public PatientRecord createRecord(String department) {
        PatientRecord record = registry.getRecord(department);
        if (record == null) {
            throw new IllegalArgumentException("Unknown department: " + department);
        }
        return record;
    }
}