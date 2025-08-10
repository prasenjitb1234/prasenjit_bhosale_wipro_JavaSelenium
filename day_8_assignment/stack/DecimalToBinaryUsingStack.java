package day_8_assignment.stack;

import java.util.Scanner;
import java.util.Stack;

//	Convert a decimal number to binary using Stack.

public class DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int num = decimal;

        if (num == 0) {
            stack.push(0);
        } else {
            while (num > 0) {
                int rem = num % 2;
                stack.push(rem);
                num = num / 2;
            }
        }

        System.out.print("Binary of " + decimal + " is: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();

     
    }
}
