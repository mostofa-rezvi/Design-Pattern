package service;

import factory.RecordFactory;
import records.PatientRecord;
import records.builder.PatientRecordBuilder;
import singleton.RecordIdGenerator;

/**
 * The main service class, now refactored to use design patterns.
 * SOLID: Single Responsibility Principle - Its only responsibility is to coordinate the record generation process.
 * It delegates creation to the Factory and formatting to the Builder.
 * SOLID: Dependency Inversion Principle - It depends on abstractions (RecordFactory, PatientRecordBuilder)
 * rather than concrete implementations.
 */
public class PatientRecordService {
    private final RecordFactory recordFactory;

    public PatientRecordService(RecordFactory recordFactory) {
        this.recordFactory = recordFactory;
    }

    /**
     * Generates a patient record by coordinating the factory, builder, and singleton.
     * @param department The department to generate a record for.
     * @param patientName The name of the patient.
     * @param builder The builder to use for formatting the record (e.g., detailed or summary).
     */
    public void generateRecord(String department, String patientName, PatientRecordBuilder builder) {
        try {
            PatientRecord record = recordFactory.createRecord(department);

            int recordId = RecordIdGenerator.getInstance().generateRecordId();

            builder.buildPatientInfo(patientName, recordId);

            record.construct(builder);

            System.out.println(builder.getResult());

        } catch (IllegalArgumentException e) {
            System.err.println("Error generating record: " + e.getMessage());
        }
    }
}