package records.departments;

import records.PatientRecord;
import records.builder.PatientRecordBuilder;

public class NeurologyRecord implements PatientRecord {
    @Override
    public void construct(PatientRecordBuilder builder) {
        builder.buildDepartment("Neurology");
        builder.buildDiagnosis("Common Diagnosis: Migraine, Epilepsy");
        builder.buildTests("Standard Tests: MRI, EEG, Cognitive Assessment");
        builder.buildNotes("Notes: Follow-up required in 3 months.");
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