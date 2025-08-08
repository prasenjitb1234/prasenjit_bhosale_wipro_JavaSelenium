package day_3_assignment.array;


public class CheckIfArrayIsPalindromeOrNot {
	public static void main(String[] args) {

//    	check if array is palindrome or not

		int[] arr = { 1, 2, 3, 2, 1 };
		boolean isPalin = true;

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				isPalin = false;
				break;
			}
		}

		if (isPalin) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
