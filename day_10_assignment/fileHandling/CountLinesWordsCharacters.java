package day_10_assignment.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWordsCharacters {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

		if (f.exists()) {
			int lineCount = 0;
			int wordCount = 0;
			int charCount = 0;

			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;

				while ((line = br.readLine()) != null) {
					lineCount++;
					charCount += line.length();
					
					String[] words = line.trim().split("\\s+");
					if (!line.trim().isEmpty()) {
						wordCount += words.length;
					}
				}

				System.out.println("Total Lines: " + lineCount);
				System.out.println("Total Words: " + wordCount);
				System.out.println("Total Characters: " + charCount);

			} catch (IOException e) {
				System.out.println("An error occurred while reading the file.");
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					System.out.println("Error while closing the file reader.");
				}
			}
		} else {
			System.out.println("File NOT found!");
		}
	}
}
