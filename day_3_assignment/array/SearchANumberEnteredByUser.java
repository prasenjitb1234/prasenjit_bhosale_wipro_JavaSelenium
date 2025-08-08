package day_3_assignment.array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchANumberEnteredByUser {
//	write a program to search for a number entered by the user in an array

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Array is : " + Arrays.toString(arr));

		System.out.println("Enter a number to search : ");
		int target = sc.nextInt();

		int low = 0;
		int high = arr.length - 1;

		boolean status = false;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				status = true;
				System.out.println("Element found at index : " + mid);
				break;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		if (status == false) {
			System.out.println("Element Not Fount in the Array");
		}

	}
}
