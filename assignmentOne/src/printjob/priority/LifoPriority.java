package printjob.priority;

import model.PrintRequest;

import java.util.LinkedList;
import java.util.Queue;

public class LifoPriority implements PrioritySetting {
    @Override
    public PrintRequest getNextJob(Queue<PrintRequest> jobQueue) {
        return ((LinkedList<PrintRequest>) jobQueue).pollLast();
    }
}