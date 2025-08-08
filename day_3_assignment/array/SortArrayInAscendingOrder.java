package day_3_assignment.array;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
	public static void main(String[] args) {
		
//		Sort an array in ascending order --> bubble sort 
		
		int arr[] = {30,100,20,10,50,40,70,80,60,90};
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		
		// bubble sort
		
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("After sorting : "+Arrays.toString(arr));
		
		
		
	}
}
