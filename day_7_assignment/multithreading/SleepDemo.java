package day_7_assignment.multithreading;

// 4 Demonstrate the use of Thread.sleep() by pausing execution between numbers from 1 to 3.

class SleepDemoThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class SleepDemo {
	public static void main(String[] args) {
		SleepDemoThread t1 = new SleepDemoThread();
		t1.start();
	}
}
