package day_6_assignment.exception_handling;

//2: Throw and Handle Custom Exception

//Create a class OddChecker:
//1.	Implement a static method:
//public static void checkOdd(int n) throws OddNumberException { /* ... */ }
//2.	If n is odd, throw a custom checked exception OddNumberException with message "Odd number: " + n.
//3.	In main:
//o	Call checkOdd with different values (including odd and even).
//o	Handle exceptions with try catch, printing e.getMessage() when caught.
//Define the exception like:
//public class OddNumberException extends Exception {
//    public OddNumberException(String message) { super(message); }
//}

//---------------------Program Starts Here : -----------------------------------

// Custom Exception
class OddNumberException extends Exception {
	public OddNumberException(String message) {
		super(message);
	}
}

public class OddChecker {

	// method to check odd number
	public static void checkOdd(int n) throws OddNumberException {
		if (n % 2 != 0) {
			throw new OddNumberException("Odd number: " + n);
		} else {
			System.out.println("Even number: " + n);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 8, 11 };

		for (int n : numbers) {
			try {
				checkOdd(n);
			} catch (OddNumberException e) {
				System.out.println("Exception caught: " + e.getMessage());
			}
		}
	}
}
