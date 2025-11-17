package printjob.priority;

import model.PrintRequest;

import java.util.Queue;

public interface PrioritySetting {
    PrintRequest getNextJob(Queue<PrintRequest> jobQueue);
}