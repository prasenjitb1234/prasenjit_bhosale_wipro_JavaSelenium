package day_9_assignment.comparator;

import java.util.*;

//Q12. Sort a list of Book objects using both Comparable (by ID) and Comparator (by title, then author).

// Book implements Comparable for natural order (by ID)
class Book implements Comparable<Book> {
	int id;
	String title;
	String author;

	Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	// Natural sorting by ID
	@Override
	public int compareTo(Book b) {
		return Integer.compare(this.id, b.id);
	}

	@Override
	public String toString() {
		return id + " | " + title + " | " + author;
	}
}

public class BookDemo {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();

		books.add(new Book(3, "Harry Potter", "J.K. Rowling"));
		books.add(new Book(1, "Wings of Fire", "A.P.J. Abdul Kalam"));
		books.add(new Book(2, "Think and Grow Rich", "Napoleon Hill"));
		books.add(new Book(4, "Harry Potter", "Another Author"));

		System.out.println("Original List:");
		books.forEach(System.out::println);

		// Sorting by ID using Comparable
		Collections.sort(books);
		System.out.println("\nSorted by ID (Comparable):");
		books.forEach(System.out::println);

		// Sorting by Title, then Author using Comparator
		books.sort(Comparator.comparing((Book b) -> b.title).thenComparing(b -> b.author));

		System.out.println("\nSorted by Title, then Author (Comparator):");
		books.forEach(System.out::println);
	}
}
