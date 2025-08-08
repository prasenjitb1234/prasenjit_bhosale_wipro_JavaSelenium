package day_8_assignment.stack;

import java.util.Stack;

//•	Create a Stack of integers and:
//•	Push 5 elements.
//•	Pop the top element.
//•	Peek the current top.
//•	Check if the stack is empty.


public class StackOne {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println("Current Top Element : "+ stack.peek());
		
		System.out.println(stack.isEmpty());
		
	}
}
