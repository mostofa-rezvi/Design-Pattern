package singleton;

import java.util.concurrent.atomic.AtomicInteger;


public class RecordIdGenerator {
    private static final RecordIdGenerator INSTANCE = new RecordIdGenerator();

    private final AtomicInteger recordIdCounter = new AtomicInteger(1000);

    private RecordIdGenerator() {}

    public static RecordIdGenerator getInstance() {
        return INSTANCE;
    }

    public int generateRecordId() {
        return recordIdCounter.getAndIncrement();
    }
}