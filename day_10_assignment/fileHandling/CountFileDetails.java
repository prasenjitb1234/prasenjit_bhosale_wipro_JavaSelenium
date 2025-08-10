package day_10_assignment.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

// 6. Write a program to count the number of lines, words, and characters in a file

public class CountFileDetails {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		if (file.exists()) {
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = br.readLine()) != null) {
					lineCount++;

					String[] words = line.trim().split("\\s+");
					if (!line.trim().isEmpty()) {
						wordCount += words.length;
					}

					charCount += line.length();
				}

				System.out.println("Number of lines: " + lineCount);
				System.out.println("Number of words: " + wordCount);
				System.out.println("Number of characters: " + charCount);

			} catch (IOException e) {
				System.out.println("error OCCURed whiel reading the file");
				e.printStackTrace();
			}
		} else {
			System.out.println("File NOT found!");
		}
	}
}
