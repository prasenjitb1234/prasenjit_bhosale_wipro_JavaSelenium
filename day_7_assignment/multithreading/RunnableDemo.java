package day_7_assignment.multithreading;

// 2 Create a thread by implementing the Runnable interface 
// and print the current thread name.

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r, "Thread-1");
		Thread t2 = new Thread(r, "Thread-2");

		t1.start();
		t2.start();
	}
}
