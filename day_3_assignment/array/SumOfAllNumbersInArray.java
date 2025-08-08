package day_3_assignment.array;

public class SumOfAllNumbersInArray {
//	Write a program to find the sum of all elements in an integer array
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5};
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all elements: " + sum);
		
		
		
	}
}
