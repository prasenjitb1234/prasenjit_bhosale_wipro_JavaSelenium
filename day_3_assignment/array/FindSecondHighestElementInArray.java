package day_3_assignment.array;

public class FindSecondHighestElementInArray {
	public static void main(String[] args) {
		
//		write a program to find out second highest element from an array

		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;

		// Step 1: Find the max element
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// Step 2: Find the largest element less than max
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}

		System.out.println("Second Max element: " + secondMax);
	}
}
