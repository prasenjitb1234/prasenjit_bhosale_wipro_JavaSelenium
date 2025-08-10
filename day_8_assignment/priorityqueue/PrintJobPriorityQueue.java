package day_8_assignment.priorityqueue;

import java.util.PriorityQueue;

//2.	Print Jobs Priority:
//o	Add different print jobs (String) with priority levels.
//o	Use PriorityQueue to simulate serving high-priority jobs before others.


class PrintJob implements Comparable<PrintJob> {
    String jobName;
    int priority;

    public PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    // High priority jobs comes first
    @Override
    public int compareTo(PrintJob other) {
        if (this.priority > other.priority) {
            return -1;
        } else if (this.priority < other.priority) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class PrintJobPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<PrintJob> printQueue = new PriorityQueue<>();

        printQueue.add(new PrintJob("Document1", 3));
        printQueue.add(new PrintJob("PhotoPrint", 7));
        printQueue.add(new PrintJob("Invoice", 5));
        printQueue.add(new PrintJob("Presentation", 10));
        printQueue.add(new PrintJob("EmailPrint", 1));

        System.out.println("Serving print jobs based on priority:");

        while (!printQueue.isEmpty()) {
            PrintJob job = printQueue.poll();
            System.out.println("Printing: " + job);
        }
    }
}
