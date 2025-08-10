package day_7_assignment.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//20  Create a thread that performs a simple task (like multiplication) 
//and returns result using Callable and Future.

class MultiplyTask implements Callable<Integer> {
    private int a, b;

    public MultiplyTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer call() {
        int result = a * b;
        System.out.println("Multiplying " + a + " * " + b);
        return result;
    }
}

public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        MultiplyTask task = new MultiplyTask(6, 7);
        Future<Integer> futureResult = executor.submit(task);

        try {
            Integer result = futureResult.get(); // wait for result
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }

        executor.shutdown();
    }
}
