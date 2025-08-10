package day_5_assignment.interfaces;

//2. Moveable Shapes Simulation

//•	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
//•	Implement classes:
//o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
//o	MovableCircle(radius, center: MovablePoint)
//o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)
//•	Provide toString() to display positions.
//•	In main(), create a few objects and call move methods to simulate motion.

interface Movable {
	void moveUp();

	void moveDown();

	void moveLeft();

	void moveRight();
}

class MovablePoint implements Movable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void moveUp() {
		y += ySpeed;
	}

	public void moveDown() {
		y -= ySpeed;
	}

	public void moveLeft() {
		x -= xSpeed;
	}

	public void moveRight() {
		x += xSpeed;
	}

	public String toString() {
		return "(" + x + ", " + y + ") Speed=(" + xSpeed + "," + ySpeed + ")";
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
}

class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;

	public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	public void moveUp() {
		center.moveUp();
	}

	public void moveDown() {
		center.moveDown();
	}

	public void moveLeft() {
		center.moveLeft();
	}

	public void moveRight() {
		center.moveRight();
	}

	public String toString() {
		return "Circle [Radius=" + radius + ", Center=" + center + "]";
	}
}

class MovableRectangle implements Movable {
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {

		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	private boolean hasSameSpeed() {
		return (topLeft.getxSpeed() == bottomRight.getxSpeed()) && (topLeft.getySpeed() == bottomRight.getySpeed());
	}

	public void moveUp() {
		if (hasSameSpeed()) {
			topLeft.moveUp();
			bottomRight.moveUp();
		} else {
			System.out.println("Speeds not matching! Cannot move rectangle.");
		}
	}

	public void moveDown() {
		if (hasSameSpeed()) {
			topLeft.moveDown();
			bottomRight.moveDown();
		} else {
			System.out.println("Speeds not matching! Cannot move rectangle.");
		}
	}

	public void moveLeft() {
		if (hasSameSpeed()) {
			topLeft.moveLeft();
			bottomRight.moveLeft();
		} else {
			System.out.println("Speeds not matching! Cannot move rectangle.");
		}
	}

	public void moveRight() {
		if (hasSameSpeed()) {
			topLeft.moveRight();
			bottomRight.moveRight();
		} else {
			System.out.println("Speeds not matching! Cannot move rectangle.");
		}
	}

	public String toString() {
		return "Rectangle [TopLeft=" + topLeft + ", BottomRight=" + bottomRight + "]";
	}
}

public class MovableShapesDemo {
	public static void main(String[] args) {
		MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
		System.out.println("Initial Point: " + p1);
		p1.moveUp();
		p1.moveRight();
		System.out.println("After move: " + p1);

		System.out.println("----------");

		MovableCircle c1 = new MovableCircle(5, 10, 10, 1, 1);
		System.out.println("Initial Circle: " + c1);
		c1.moveLeft();
		c1.moveDown();
		System.out.println("After move: " + c1);

		System.out.println("----------");

		MovableRectangle r1 = new MovableRectangle(0, 5, 5, 0, 2, 2);
		System.out.println("Initial Rectangle: " + r1);
		r1.moveUp();
		r1.moveRight();
		System.out.println("After move: " + r1);
	}
}