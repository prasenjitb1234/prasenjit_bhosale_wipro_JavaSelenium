package day_5_assignment.Lambda_Expressions;

import java.util.function.Function;

//5.	 Convert Strings to Uppercase/Lowercase

public class LambdaUppercaseLowercaseConvert {

	public static void main(String[] args) {

		Function<String, String> toUpper = s -> s.toUpperCase();
		Function<String, String> toLower = s -> s.toLowerCase();

		String text = "India";

		System.out.println("Original: " + text);
		System.out.println("Uppercase: " + toUpper.apply(text));
		System.out.println("Lowercase: " + toLower.apply(text));
	}
}
