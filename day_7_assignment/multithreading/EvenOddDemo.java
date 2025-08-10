package day_7_assignment.multithreading;

// 6 Implement a program where two threads print even and odd numbers respectively.

class EvenThread extends Thread {
	public void run() {
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Even: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1; i <= 9; i += 2) {
			System.out.println("Odd: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class EvenOddDemo {
	public static void main(String[] args) {
		EvenThread even = new EvenThread();
		OddThread odd = new OddThread();

		even.start();
		odd.start();
	}
}
