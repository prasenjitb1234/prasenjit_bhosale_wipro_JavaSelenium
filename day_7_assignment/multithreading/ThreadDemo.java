package day_7_assignment.multithreading;

//1 Write a program to create a thread by extending the Thread class 
//and print numbers from 1 to 5.

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}
