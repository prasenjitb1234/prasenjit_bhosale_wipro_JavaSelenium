package day_5_assignment.Lambda_Expressions;

interface sum{
	
	int add(int a, int b);
}


public class SumOfTwoIntegers {
	public static void main(String[] args) {
		
		sum s = (a,b) ->  a + b;
		int result = s.add(10, 20);
		System.out.println("Sum : "+result);
		
	}
}
