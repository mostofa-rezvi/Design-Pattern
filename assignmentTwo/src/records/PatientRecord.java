package records;

import records.builder.PatientRecordBuilder;

public interface PatientRecord extends Cloneable {

    void construct(PatientRecordBuilder builder);

    PatientRecord clone();
}