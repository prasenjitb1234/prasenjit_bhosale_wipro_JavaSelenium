package day_4_assignment.polymorphism;

//2. Create a base class Shape with a method area() 
//that prints a message.Then create two subclassesCircleoverride area() to calculator and
//print area of circle Rectangle override area() to
//calculate and print area of a rectangle

class Shape {
	void area() {
		System.out.println("Calculating area of shape ");
	}
}

class Circle extends Shape {
	double radius = 5;  

	void area() {
		double result = Math.PI * radius * radius;   // 3.14 * (r)^2
		System.out.println("Area of Circle: " + result);
	}
}

class Rectangle extends Shape {
	double length = 10;
	double width = 4;

	void area() {
		double result = length * width;
		System.out.println("Area of Rectangle: " + result);
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.area();

		System.out.println();

		Circle c = new Circle();
		c.area();

		Rectangle r = new Rectangle();
		r.area();
	}
}
