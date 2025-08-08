package day_3_assignment.string;

public class CheckStringStartsWith_J_And_End_With_A {
	public static void main(String[] args) {
		
//		Check if String starts with “j” and end with “a” . eg. “java”
		
		String str = "Java";
		str = str.toLowerCase();
		
		if (str.startsWith("j") && str.endsWith("a")) {
			System.out.println(" The string starts with 'j' and ends with 'a' ");
		} else {
			System.out.println(" The string does NOT start with 'j' and end with 'a' ");
		}
		
	}
}
