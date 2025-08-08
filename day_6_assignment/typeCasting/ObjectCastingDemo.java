package day_6_assignment.typeCasting;

//Object Casting with Inheritance 

//1.	Define an Animal class with a method makeSound().
//2.	Define subclass Dog:
//o	Override makeSound() (e.g. "Woof!").
//o	Add method fetch().
//3.	In main:
//Dog d = new Dog();
//Animal a = d;          // upcasting
//a.makeSound();

class Animal {
	void makeSound() {
		System.out.println("Animal Makes Sound");
	}
}

class Dog extends Animal {

	void makeSound() {
		System.out.println("Woof!");
	}

	void fetch() {
		System.out.println("Dog is fetching the ball. ");
	}
}

public class ObjectCastingDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d; // Upcasting:

		a.makeSound();

//		 a.fetch();   not allowed 

		// downcast
		Dog d2 = (Dog) a;
		d2.fetch();
	}
}
