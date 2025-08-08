package day_9_assignment.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Q4. Sort a list of Book objects by bookId in descending order using Comparable.

//Hint: Override compareTo() to return the reverse order.

public class Book implements Comparable<Book> {

	int bookId;
	String authorName;
	String bookName;

	Book(int bookId, String authorName, String bookName) {
		this.bookId = bookId;
		this.authorName = authorName;
		this.bookName = bookName;
	}

	public String toString() {
		return bookId + " " + authorName + " " + bookName;
	}

	@Override
	public int compareTo(Book b) {

		return b.bookId - this.bookId;
	}

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>(Arrays.asList(new Book(1, "APJ Abdul Kalam", "Wings of Fire"),
				new Book(2, "J K Rowling", "Harry Potter"), new Book(3, "Nepolean Hill", "Think and Grow Rich")

		));

		Collections.sort(list);

		for (Book b : list) {
			System.out.println(b);
		}

	}

}
