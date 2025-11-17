package records.builder;

public class SummaryRecordBuilder implements PatientRecordBuilder {
    private final StringBuilder recordContent = new StringBuilder();

    @Override
    public void buildPatientInfo(String patientName, int recordId) {
        recordContent.append(String.format("Summary for %s (ID: %d)\n", patientName, recordId));
    }

    @Override
    public void buildDepartment(String department) {
        recordContent.append(String.format("Dept: %s | ", department));
    }

    @Override
    public void buildDiagnosis(String diagnosis) {
        recordContent.append("Diagnosis Included | ");
    }

    @Override
    public void buildTests(String tests) {
        recordContent.append(String.format("Tests: %s\n", tests));
    }

    @Override
    public void buildNotes(String notes) {
    }

    @Override
    public String getResult() {
        return recordContent.toString();
    }
}