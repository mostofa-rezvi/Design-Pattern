package printjob;

import model.PrintRequest;
import printjob.priority.PrioritySetting;

import java.util.LinkedList;
import java.util.Queue;

public class PrintJob {
    private final Queue<PrintRequest> jobQueue;
    private PrioritySetting prioritySetting;

    public PrintJob(PrioritySetting initialPriority) {
        this.jobQueue = new LinkedList<>();
        this.prioritySetting = initialPriority;
    }

    public void addJob(PrintRequest request) {
        jobQueue.add(request);
        System.out.println("Job added to the queue. Queue size: " + jobQueue.size());
    }

    public void pullJob() {
        if (jobQueue.isEmpty()) {
            System.out.println("Print queue is empty. No jobs to pull.");
            return;
        }
        System.out.println("\nPulling job based on " + prioritySetting.getClass().getSimpleName() + "...");
        PrintRequest nextJob = prioritySetting.getNextJob(jobQueue);
        if (nextJob != null) {
            sendToProduction(nextJob);
        }
    }

    private void sendToProduction(PrintRequest job) {
        System.out.println("Sending job to production...");
        job.applyModes();
        System.out.println("Job sent successfully.");
    }

    public void changePriority(PrioritySetting newPriority) {
        System.out.println("\n---> Changing print priority from " +
                prioritySetting.getClass().getSimpleName() + " to " +
                newPriority.getClass().getSimpleName() + ". <---");
        this.prioritySetting = newPriority;
    }
}