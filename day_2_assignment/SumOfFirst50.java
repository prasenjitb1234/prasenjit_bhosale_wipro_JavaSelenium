package day_2_assignment;

public class SumOfFirst50 {
	public static void main(String[] args) {
		
		// sum of frist 50 nubmers
		
		int sum = 0;
		
		for(int i = 1; i <= 50; i++) {
			sum += i;
		}
		
		System.out.println("Sum of first 50 numbers: " + sum);
	}
}
