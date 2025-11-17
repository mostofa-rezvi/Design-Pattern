package factory;

import records.PatientRecord;

public interface RecordFactory {
    PatientRecord createRecord(String department);
}