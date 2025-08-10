package day_10_assignment.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

//15. Write a program to write data into a file using Files.write() and append using StandardOpenOption.APPEND.

public class WriteAndAppendDemo {
	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\prasen.txt");

		try {

			Files.write(filePath, Arrays.asList("This is the first line.", "This is the second line."));

			Files.write(filePath, Arrays.asList("This is an appended line."), StandardOpenOption.APPEND);

			System.out.println("Data written and appended successfully.");
		} catch (IOException e) {
			System.out.println("Error in writing or appending to file: " + e.getMessage());
		}
	}
}
