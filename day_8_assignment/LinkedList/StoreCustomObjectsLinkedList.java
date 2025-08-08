package day_8_assignment.LinkedList;

import java.util.LinkedList;

//9. Store Custom Objects in LinkedList
//Write a program to:
//•	Create a class Book with fields: id, title, and author.
//•	Create a LinkedList of Book objects.
//•	Add 3 books and display their details using a loop.


class Book{
	int id;
	String title;
	String author;
	
	Book(int id, String title, String author){
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	void display() {
		System.out.println("Book Id : "+id+" Title : "+title+" Author : "+author);
	}
	
	
}



public class StoreCustomObjectsLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Book> list = new LinkedList<>();
		
		list.add(new Book(1,"Wings of Fire","APJ Abdul Kalam"));
		list.add(new Book(2,"Harry Potter","J K Rowling"));
		list.add(new Book(3,"Mahabharat","Valmik"));
		
		for(Book b : list) {
			b.display();
		}
		
	}
}
