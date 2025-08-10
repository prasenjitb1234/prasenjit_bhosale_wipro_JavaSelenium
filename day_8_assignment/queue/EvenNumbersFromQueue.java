package day_8_assignment.queue;

import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

//3.	Write a method:
//	That takes a queue of integers and returns a list of even numbers.

public class EvenNumbersFromQueue {

	public static List<Integer> getEvenNumbers(Queue<Integer> numbers) {
		List<Integer> evenNumbers = new ArrayList<>();

		for (int num : numbers) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			}
		}

		return evenNumbers;
	}

	public static void main(String[] args) {
		Queue<Integer> nums = new LinkedList<>();

		nums.add(10);
		nums.add(15);
		nums.add(22);
		nums.add(7);
		nums.add(8);

		System.out.println("Original Queue: " + nums);

		List<Integer> evens = getEvenNumbers(nums);
		System.out.println("Even numbers: " + evens);
	}
}
