package day_6_assignment.Enums;

//3: Shape Area Calculator

//Define enum Shape (CIRCLE, SQUARE, RECTANGLE, TRIANGLE) where each constant:
//•	Overrides a method double area(double... params) to compute its area.
//•	E.g., CIRCLE expects radius, TRIANGLE expects base and height.
//Loop over all constants with sample inputs and print results.

public class ShapeAreaCalculator {

	enum Shape {
		CIRCLE {

			double area(double... params) {
				double radius = params[0];
				return Math.PI * radius * radius;
			}
		},
		RECTANGLE {

			double area(double... params) {
				double length = params[0];
				double width = params[1];
				return length * width;
			}
		},
		SQUARE {

			double area(double... params) {
				double side = params[0];
				return side * side;
			}
		},
		TRIANGLE {

			double area(double... params) {
				double base = params[0];
				double height = params[1];
				return 0.5 * base * height;
			}
		};

		abstract double area(double... params);
	}

	public static void main(String[] args) {

		System.out.println("Sample Areas:");

		System.out.println("Circle area (radius 5): " + Shape.CIRCLE.area(5));
		System.out.println("Rectangle area (length 4, width 6): " + Shape.RECTANGLE.area(4, 6));
		System.out.println("Square area (side 7): " + Shape.SQUARE.area(7));
		System.out.println("Triangle area (base 10, height 8): " + Shape.TRIANGLE.area(10, 8));

		System.out.println("\nLooping over all shapes with sample inputs:");
		for (Shape s : Shape.values()) {
			switch (s) {
			case CIRCLE:
				System.out.println(s + " area: " + s.area(3));
				break;
			case RECTANGLE:
				System.out.println(s + " area: " + s.area(4, 5));
				break;
			case SQUARE:
				System.out.println(s + " area: " + s.area(6));
				break;
			case TRIANGLE:
				System.out.println(s + " area: " + s.area(5, 12));
				break;
			}
		}
	}
}
