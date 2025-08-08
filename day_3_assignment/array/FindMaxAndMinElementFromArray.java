package day_3_assignment.array;

public class FindMaxAndMinElementFromArray {
	public static void main(String[] args) {
		
//		find maximum and minimum elements from an array.
		
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		int max = arr[0];
		int min = arr[0];
		
		
		// max element
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		// min element 
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Maximum Element is : "+max);
		System.out.println("Minimum Element is : "+min);
		
		
		
		
	}
}
