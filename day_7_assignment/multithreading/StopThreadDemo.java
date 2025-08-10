package day_7_assignment.multithreading;

// 9 Show how to stop a thread using a boolean flag.

class StopThread extends Thread {
	volatile boolean running = true;

	public void run() {
		System.out.println("Thread started..");
		while (running) {
			System.out.println("Thread is running..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Thread stopped.");
	}

	public void stopThread() {
		running = false;
	}
}

public class StopThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		StopThread t1 = new StopThread();
		t1.start();

		Thread.sleep(3000); 

		t1.stopThread(); // stop thread
	}
}
