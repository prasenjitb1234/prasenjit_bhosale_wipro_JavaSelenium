package day_3_assignment.array;

public class SegregateEvenOddNumbers {
	public static void main(String[] args) {
//		segregate even and odd numbers
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int evens = 0;
		int odds = 0;
		
		System.out.print("Even numbers: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] +" ");
			}
		}
		
		System.out.print("\nOdd Nubmers : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] +" ");
			}
		}
		
		
		
		
		
	}
}
