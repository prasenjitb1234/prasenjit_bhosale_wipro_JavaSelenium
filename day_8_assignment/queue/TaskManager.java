package day_8_assignment.queue;

import java.util.LinkedList;
import java.util.Queue;

//2.	Task Manager:
//	Queue of tasks (String values).
//	Add tasks, peek at the next task, and poll completed tasks.


public class TaskManager {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        
        tasks.add("Write report");
        tasks.add("Email client");
        tasks.add("Prepare presentation");
        tasks.add("Schedule meeting");

        System.out.println("All tasks: " + tasks);

        
        String nextTask = tasks.peek();
        System.out.println("\nNext task to do: " + nextTask);

        // Poll our completed TASks one by one
        while (!tasks.isEmpty()) {
            String completedTask = tasks.poll();
            System.out.println("\nCompleted task: " + completedTask);
            System.out.println("\nRemaining tasks: " + tasks);
        }
    }
}
