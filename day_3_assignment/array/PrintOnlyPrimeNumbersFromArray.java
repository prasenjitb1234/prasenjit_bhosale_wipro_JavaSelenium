package day_3_assignment.array;

public class PrintOnlyPrimeNumbersFromArray {
	
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
//		print only prime numbers from array
		
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17};
		
		System.out.println("Prime numbers in the array are:");

		for (int num : arr) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}
		
	

	
}
