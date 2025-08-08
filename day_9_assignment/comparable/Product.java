package day_9_assignment.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Q2. Create a Product class and sort products by price using Comparable.
//Implement Comparable<Product> and sort a list of products using Collections.sort().


public class Product implements Comparable<Product> {
	
	int productId;
	String productName;
	int productPrice;
	
	Product(int productId, String productName, int productPrice){
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String toString() {
		return productId+" "+productName+" "+productPrice;
	}
	
	@Override
	public int compareTo(Product p) {
		
		return productPrice - p.productPrice;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Product> list = new ArrayList<>(
				Arrays.asList(new Product(1,"Samsung A15",20000),
						new Product(4,"Casio Watch ",1500),
						new Product(2,"Iphone 16", 80000),
						new Product(3,"HP 15s",45000)
						)
				);
		
		Collections.sort(list);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		
		
	}

	
}
