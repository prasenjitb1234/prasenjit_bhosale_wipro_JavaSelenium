package day_8_assignment.stack;

import java.util.Stack;

//•	Reverse a string using Stack:
//•	Input a string from the user.
//•	Use a stack to reverse and print the string.

public class ReverseAStringUsingStack {
	public static void main(String[] args) {

		String str = "Prasenjit";

		str = str.toLowerCase();

		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			stack.push(ch);
		}

		// Pop characters from the stack to reverse
		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversed.toString());

	}
}
