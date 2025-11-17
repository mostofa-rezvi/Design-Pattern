package records.builder;

public class DetailedRecordBuilder implements PatientRecordBuilder {
    private final StringBuilder recordContent = new StringBuilder();

    @Override
    public void buildPatientInfo(String patientName, int recordId) {
        recordContent.append("--- PATIENT RECORD (DETAILED) ---\n");
        recordContent.append(String.format("Record ID: %d\nPatient Name: %s\n", recordId, patientName));
        recordContent.append("---------------------------------\n");
    }

    @Override
    public void buildDepartment(String department) {
        recordContent.append(String.format("Department: %s\n", department));
    }

    @Override
    public void buildDiagnosis(String diagnosis) {
        recordContent.append(String.format("Diagnosis Details: %s\n", diagnosis));
    }

    @Override
    public void buildTests(String tests) {
        recordContent.append(String.format("Tests Conducted: %s\n", tests));
    }

    @Override
    public void buildNotes(String notes) {
        recordContent.append(String.format("Physician's Notes: %s\n", notes));
    }

    @Override
    public String getResult() {
        recordContent.append("----------- END OF RECORD -----------\n");
        return recordContent.toString();
    }
}