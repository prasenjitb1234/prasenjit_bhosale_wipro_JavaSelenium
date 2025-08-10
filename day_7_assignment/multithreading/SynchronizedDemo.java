package day_7_assignment.multithreading;

// 11 Solve race condition using synchronized keyword

class Counter {
	int count = 0;

	synchronized void increment() {
		count++;
	}
}

class SyncThread extends Thread {
	Counter counter;

	public SyncThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		SyncThread t1 = new SyncThread(counter);
		SyncThread t2 = new SyncThread(counter);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final count (expected 2000): " + counter.count);
	}
}
