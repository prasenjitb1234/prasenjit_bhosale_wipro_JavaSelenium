package day_5_assignment.interfaces;

//3. Contract Programming: Printer Switch

//	Declare an interface Printer with method void print(String document).
//	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
//	In the client code, declare Printer p;, switch implementations at runtime, and test printing.

interface Printer {
	void print(String document);
}

class LaserPrinter implements Printer {
	public void print(String document) {
		System.out.println("LaserPrinter is printing: " + document);
	}
}

class InkjetPrinter implements Printer {
	public void print(String document) {
		System.out.println("InkjetPrinter is printing: " + document);
	}
}

public class PrinterDemo {
	public static void main(String[] args) {
		Printer p;

		p = new LaserPrinter();
		p.print("Java Programming Notes");

		p = new InkjetPrinter();
		p.print("Design Patterns Report");
	}
}
