package day_8_assignment.vector;

import java.util.Enumeration;
import java.util.Vector;

//•	Create a Vector of integers and perform the following operations:
//•	Add 5 integers to the Vector.
//•	Insert an element at the 3rd position.
//•	Remove the 2nd element.
//•	Display the elements using Enumeration.


public class CreateAVector {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		v.add(100);
		v.add(40);
		v.add(20);
		v.add(80);
		v.add(56);
		System.out.println(v);
		
		v.add(3, 22);
		System.out.println(v);
		
		v.remove(2);
		System.out.println("After Removing 2nd Element : "+v);
		
		
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
	}
}
