package records.departments;

import records.PatientRecord;
import records.builder.PatientRecordBuilder;

public class DermatologyRecord implements PatientRecord {
    @Override
    public void construct(PatientRecordBuilder builder) {
        builder.buildDepartment("Dermatology");
        builder.buildDiagnosis("Common Diagnosis: Eczema, Psoriasis");
        builder.buildTests("Standard Tests: Skin Biopsy, Allergy Test");
        builder.buildNotes("Notes: Topical cream prescribed.");
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