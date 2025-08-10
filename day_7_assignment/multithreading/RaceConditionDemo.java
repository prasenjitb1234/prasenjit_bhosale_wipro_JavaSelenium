package day_7_assignment.multithreading;

// 10 Multiple threads increment a shared counter without synchronization - race condition demo


class Counter {
	int count = 0;

	void increment() {
		count++;
	}
}

class RaceConditionThread extends Thread {
	Counter counter;

	public RaceConditionThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}

public class RaceConditionDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		RaceConditionThread t1 = new RaceConditionThread(counter);
		RaceConditionThread t2 = new RaceConditionThread(counter);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final count:  " + counter.count);
	}
}
