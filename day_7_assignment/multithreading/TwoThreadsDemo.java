package day_7_assignment.multithreading;

// 3 Write a program to create two threads, each printing a different message 5 times.

class MessageThread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class MessageThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello Java 2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class TwoThreadsDemo {
	public static void main(String[] args) {
		MessageThread1 t1 = new MessageThread1();
		MessageThread2 t2 = new MessageThread2();

		t1.start();
		t2.start();
	}
}
