package day_8_assignment.priorityqueue;

import java.util.PriorityQueue;

//3.	Write a method:
//o	To merge two PriorityQueue<Integer> and return a sorted merged queue.


public class MergePriorityQueues {

    // merge 2 queues method
    public static PriorityQueue<Integer> mergeQueues(PriorityQueue<Integer> q1, PriorityQueue<Integer> q2) {
        PriorityQueue<Integer> mergedQueue = new PriorityQueue<>();

        // first queue
        mergedQueue.addAll(q1);
        // second queue
        mergedQueue.addAll(q2);

        return mergedQueue;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();

        queue1.add(10);
        queue1.add(5);
        queue1.add(30);

        queue2.add(20);
        queue2.add(15);
        queue2.add(25);

        System.out.println("Queue 1: " + queue1);
        System.out.println("Queue 2: " + queue2);

        PriorityQueue<Integer> merged = mergeQueues(queue1, queue2);

        System.out.println("Merged Queue (sorted):");

        // Poll elements to show sorted order
        while (!merged.isEmpty()) {
            System.out.print(merged.poll() + " ");
        }
    }
}
