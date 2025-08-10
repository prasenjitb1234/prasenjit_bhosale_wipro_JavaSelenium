package day_10_assignment.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//	14. Write a program to read all lines of a file using Files.readAllLines() and print them.
public class ReadAllLinesDemo {
	public static void main(String[] args) {

		Path filePath = Paths.get("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

		try {

			List<String> lines = Files.readAllLines(filePath);

			System.out.println("File contents:");
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
