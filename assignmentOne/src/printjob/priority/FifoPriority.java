package printjob.priority;

import model.PrintRequest;

import java.util.Queue;

public class FifoPriority implements PrioritySetting {
    @Override
    public PrintRequest getNextJob(Queue<PrintRequest> jobQueue) {
        return jobQueue.poll();
    }
}