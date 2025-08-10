package day_7_assignment.multithreading;

// 7 Create a program that starts three threads and sets different priorities for them.

class PriorityThread extends Thread {
	public PriorityThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		PriorityThread t1 = new PriorityThread("Low Priority Thread");
		PriorityThread t2 = new PriorityThread("Medium Priority Thread");
		PriorityThread t3 = new PriorityThread("High Priority Thread");

		t1.setPriority(Thread.MIN_PRIORITY); 
		t2.setPriority(Thread.NORM_PRIORITY); 
		t3.setPriority(Thread.MAX_PRIORITY); 

		t1.start();
		t2.start();
		t3.start();
	}
}
