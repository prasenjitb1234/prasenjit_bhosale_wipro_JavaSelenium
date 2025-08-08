package day_2_assignment;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num = 29; 
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is Not a Prime Number");
		}
	}
}
