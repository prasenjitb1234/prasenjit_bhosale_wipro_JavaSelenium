package day_8_assignment.hashset;

import java.util.HashSet;
import java.util.Iterator;

//3.	Write a method that takes a HashSet<Integer> and returns the maximum element.

public class HashSetMaxElement {

	public static int findMax(HashSet<Integer> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			System.out.println("HashSet is empty or null.");
			return Integer.MIN_VALUE;
		}

		Iterator<Integer> itr = numbers.iterator();
		int max = itr.next();

		while (itr.hasNext()) {
			int current = itr.next();
			if (current > max) {
				max = current;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<>();

		nums.add(45);
		nums.add(12);
		nums.add(98);
		nums.add(23);
		nums.add(67);

		System.out.println("Numbers in HashSet: " + nums);

		int maxValue = findMax(nums);
		System.out.println("Maximum element is: " + maxValue);
	}
}
