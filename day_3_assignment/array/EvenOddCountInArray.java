package day_3_assignment.array;

public class EvenOddCountInArray {
	public static void main(String[] args) {
//		Write a program to count even and odd numbers from an array
		
		
		int nums[] = {1,2,3,4,5,6};
		
		int even_count = 0;
		int odd_count = 0;
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] % 2 == 0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		
		System.out.println("Even Numbers Count : "+even_count);
		System.out.println("Odd Numbers Count : "+odd_count);
		
		
	}
}
