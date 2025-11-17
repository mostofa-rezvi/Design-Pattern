package records.departments;

import records.PatientRecord;
import records.builder.PatientRecordBuilder;

public class OrthopedicsRecord implements PatientRecord {
    @Override
    public void construct(PatientRecordBuilder builder) {
        builder.buildDepartment("Orthopedics");
        builder.buildDiagnosis("Common Diagnosis: Fracture, Arthritis");
        builder.buildTests("Standard Tests: X-ray, Bone Density Test, MRI");
        builder.buildNotes("Notes: Physiotherapy recommended.");
    }

    @Override
    public PatientRecord clone() {
        try {
            return (PatientRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}