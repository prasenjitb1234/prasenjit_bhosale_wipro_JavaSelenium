package day_3_assignment.variables;

public class SwapTwoNumbersUsingThirdVariable {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping a : "+a+" and  b: "+b);
		// swap them using third variable
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping a : "+a+" and  b: "+b);
		
	}
}
