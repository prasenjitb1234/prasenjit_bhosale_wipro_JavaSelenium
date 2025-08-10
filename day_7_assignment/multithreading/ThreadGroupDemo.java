package day_7_assignment.multithreading;

// 19 Demonstrate ThreadGroup creation and management

class TaskThread extends Thread {
    public TaskThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(getName() + " is running in group: " + getThreadGroup().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " finished");
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) throws InterruptedException {
        
        ThreadGroup group = new ThreadGroup("MyGroup");

       
        TaskThread t1 = new TaskThread(group, "Thread-1");
        TaskThread t2 = new TaskThread(group, "Thread-2");
        TaskThread t3 = new TaskThread(group, "Thread-3");

      
        t1.start();
        t2.start();
        t3.start();

        
        System.out.println("Active threads in group: " + group.activeCount());

        Thread.sleep(1500); 

        
        group.interrupt();

        System.out.println("Thread group name: " + group.getName());
        System.out.println("Active threads after interrupt: " + group.activeCount());
    }
}
