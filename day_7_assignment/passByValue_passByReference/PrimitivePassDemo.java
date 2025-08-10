package day_7_assignment.passByValue_passByReference;

//3.	Write a Java program to pass primitive data types to a method and observe whether changes inside the method affect the original variables.

public class PrimitivePassDemo {

	static void changeValues(int num, double decimal, boolean flag) {
		System.out.println("Inside method (before change):");
		System.out.println("num = " + num + ", decimal = " + decimal + ", flag = " + flag +" \n");

		num = 99;
		decimal = 99.99;
		flag = !flag;

		System.out.println("Inside method (after change):");
		System.out.println("num = " + num + ", decimal = " + decimal + ", flag = " + flag +" \n");
	}

	public static void main(String[] args) {

		int myNum = 10;
		double myDecimal = 20.5;
		boolean myFlag = true;

		System.out.println("Before method call:");
		System.out.println("myNum = " + myNum + ", myDecimal = " + myDecimal + ", myFlag = " + myFlag +" \n");

		changeValues(myNum, myDecimal, myFlag);

		System.out.println("After method call:");
		System.out.println("myNum = " + myNum + ", myDecimal = " + myDecimal + ", myFlag = " + myFlag +" \n");
	}
}
