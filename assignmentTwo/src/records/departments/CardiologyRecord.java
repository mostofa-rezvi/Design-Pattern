package records.departments;

import records.PatientRecord;
import records.builder.PatientRecordBuilder;

public class CardiologyRecord implements PatientRecord {
    @Override
    public void construct(PatientRecordBuilder builder) {
        builder.buildDepartment("Cardiology");
        builder.buildDiagnosis("Common Diagnosis: Arrhythmia, Hypertension");
        builder.buildTests("Standard Tests: ECG, Blood Pressure, Cholesterol");
        builder.buildNotes("Notes: Patient advised to monitor salt intake.");
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