package day_2_assignment;



public class SumOfDigitsInNumber {
	public static void main(String[] args) {
		

		
		int num = 12345;

		int sum = 0;
		int temp = num;

		while (temp != 0) {
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}

		System.out.println("Sum of digits in " + num + " = " + sum);
	}
}
