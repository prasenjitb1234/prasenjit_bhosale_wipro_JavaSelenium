package day_7_assignment.multithreading;

// 8 Demonstrate Thread.join() – wait for a thread to finish before proceeding.

class JoinThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread();
		t1.setName("Worker Thread");

		t1.start();

		try {
			t1.join(); 
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		
	}
}
