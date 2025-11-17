package records.builder;

public interface PatientRecordBuilder {
    void buildPatientInfo(String patientName, int recordId);
    void buildDepartment(String department);
    void buildDiagnosis(String diagnosis);
    void buildTests(String tests);
    void buildNotes(String notes);
    String getResult();
}