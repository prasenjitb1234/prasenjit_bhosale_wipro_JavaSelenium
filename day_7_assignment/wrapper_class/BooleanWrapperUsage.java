package day_7_assignment.wrapper_class;

public class BooleanWrapperUsage {
	public static void main(String[] args) {

		// Primitive boolean
		boolean flag = true;

		// Convert primitive to Boolean object (autoboxing)
		Boolean boolObj1 = flag;
		System.out.println("Boolean object from primitive: " + boolObj1);

		Boolean boolObj2 = Boolean.valueOf("true");
		Boolean boolObj3 = Boolean.valueOf("FALSE");
		System.out.println("Boolean object from String (true): " + boolObj2);
		System.out.println("Boolean object from String (false): " + boolObj3);

		// Convert Boolean object to primitive
		boolean primitive1 = boolObj2.booleanValue();
		System.out.println("Primitive boolean from Boolean object: " + primitive1);

		// Using parseBoolean (returns primitive)
		boolean parsedBool = Boolean.parseBoolean("TrUe");
		System.out.println("Parsed boolean from String: " + parsedBool);

		// Checking equality
		if (boolObj2.equals(Boolean.TRUE)) {
			System.out.println("The value is TRUE");
		} else {
			System.out.println("The value is FALSE");
		}
	}
}
