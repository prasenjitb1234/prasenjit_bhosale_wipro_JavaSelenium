package day_7_assignment.multithreading;

// 18 Demonstrate Thread.isAlive() to check thread status

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread started.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread finished.");
    }
}

public class ThreadStatusDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();

        System.out.println("Before starting, isAlive(): " + t1.isAlive());

        t1.start();

        System.out.println("Just after start, isAlive(): " + t1.isAlive());

        t1.join(); 

        System.out.println("After completion, isAlive(): " + t1.isAlive());
    }
}
