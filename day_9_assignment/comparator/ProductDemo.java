package day_9_assignment.comparator;

import java.util.*;

class Product {
	int id;
	String name;
	double price;

	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + price;
	}
}

//  Price Ascending
class PriceAscComparator implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.price, p2.price);
	}
}

//  Price Descending
class PriceDescComparator implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return Double.compare(p2.price, p1.price);
	}
}

// Name Alphabetical
class NameComparator implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return p1.name.compareTo(p2.name);
	}
}

public class ProductDemo {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();

		list.add(new Product(1, "Laptop", 55000));
		list.add(new Product(2, "Mobile", 25000));
		list.add(new Product(3, "Tablet", 30000));

		System.out.println("Original List:");
		list.forEach(System.out::println);

		// sort by Price ascending
		Collections.sort(list, new PriceAscComparator());
		System.out.println("\nSorted by Price Ascending:");
		list.forEach(System.out::println);

		// sort by Price descending
		Collections.sort(list, new PriceDescComparator());
		System.out.println("\nSorted by Price Descending:");
		list.forEach(System.out::println);

		// sort by Name alphabetically
		Collections.sort(list, new NameComparator());
		System.out.println("\nSorted by Name Alphabetically:");
		list.forEach(System.out::println);
	}
}
