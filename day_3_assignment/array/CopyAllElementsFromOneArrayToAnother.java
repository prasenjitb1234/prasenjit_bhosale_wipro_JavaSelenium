package day_3_assignment.array;

public class CopyAllElementsFromOneArrayToAnother {
	public static void main(String[] args) {

//		copy all elements from one array to another

		int arr1[] = { 1, 2, 3, 4, 5 };

		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// printing copied array
		System.out.print("Elements in arr2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}
