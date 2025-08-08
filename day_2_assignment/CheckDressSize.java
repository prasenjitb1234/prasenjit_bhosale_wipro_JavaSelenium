package day_2_assignment;

public class CheckDressSize {
	/*
	 * write a program for dress size like 26=extra small 28=small size 30=medium
	 * 32=large 34=Extra large 36=extra extra large..
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int size = 32;

		if (size == 26) {
			System.out.println("Extra Small");
		} else if (size == 28) {
			System.out.println("Small");
		} else if (size == 30) {
			System.out.println("Medium");
		} else if (size == 32) {
			System.out.println("Large");
		} else if (size == 34) {
			System.out.println("Extra Large");
		} else if (size == 36) {
			System.out.println("Extra Extra Large");
		} else {
			System.out.println("Invalid Size");
		}
	}
}
