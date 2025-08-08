package day_3_assignment.array;

public class FrequencyOfEachDigit {
	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 2, 3, 4, 4, 4, 5, 9, 9, 0, 1 };

		int[] freq = new int[10]; 

		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}

		System.out.println("Frequency of each digit (0-9):");

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println("Digit " + i + " : " + freq[i] + " times");
			}
		}
	}
}
