package day_7_assignment.multithreading;

// 12 Use synchronized block to ensure mutual exclusion

class SharedResource {
	int count = 0;
	final Object lock = new Object();

	void increment() {
		synchronized (lock) {
			count++;
		}
	}
}

class SyncBlockThread extends Thread {
	SharedResource resource;

	public SyncBlockThread(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			resource.increment();
		}
	}
}

public class SynchronizedBlockDemo {
	public static void main(String[] args) throws InterruptedException {
		SharedResource resource = new SharedResource();

		SyncBlockThread t1 = new SyncBlockThread(resource);
		SyncBlockThread t2 = new SyncBlockThread(resource);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final count (expected 2000): " + resource.count);
	}
}
