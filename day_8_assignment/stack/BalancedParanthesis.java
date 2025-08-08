package day_8_assignment.stack;

import java.util.Stack;

//•	Use Stack to check for balanced parentheses in an expression.
//•	Input: (a+b) * (c-d)
//•	Output: Valid or Invalid expression

public class BalancedParanthesis {
	public static void main(String[] args) {

		String str = "(a+b) * (c-d)";

		Stack<Character> stack = new Stack<>();
		
		boolean status = true;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					status = false;
					break;
				}
			}
		}

		if (!stack.isEmpty()) {
			status = false;
		}

		if (status) {
			System.out.println("Valid Expression");
		} else {
			System.out.println("Invalid Expression");
		}
	}
}
