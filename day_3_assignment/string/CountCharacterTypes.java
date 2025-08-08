package day_3_assignment.string;

public class CountCharacterTypes {
	public static void main(String[] args) {

//		Write a Program to count digits, letters, spaces and Special characters

		String str = "Hello @123 World! #Java ^!%Prasenjit";

		int letters = 0, digits = 0, spaces = 0, specialChars = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				letters++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else if (ch == ' ') {
				spaces++;
			} else {
				specialChars++;
			}
		}

		System.out.println("Letters: " + letters);
		System.out.println("Digits: " + digits);
		System.out.println("Spaces: " + spaces);
		System.out.println("Special Characters: " + specialChars);
	}
}
