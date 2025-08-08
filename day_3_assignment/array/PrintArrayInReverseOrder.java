package day_3_assignment.array;

public class PrintArrayInReverseOrder {
	public static void main(String[] args) {
		
//		write a program to print an array in reverse order
		
		int[] arr = {10, 20, 30, 40, 50};

		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nArray in Reverse Order:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
}
