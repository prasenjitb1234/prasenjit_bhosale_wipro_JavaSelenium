package day_2_assignment;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome : ");

		int num = sc.nextInt();

		int org_num = num;
		int reversed = 0;

		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}

		if (reversed == org_num) {
			System.out.println(org_num + " is a Palindrome");
		} else {
			System.out.println(org_num + " is Not a Palindrome");
		}
	}
}
