package day_10_assignment.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendALineIntoExistingFile {
//	•	5. Write a program to append a line of text to an existing file. .

	public static void main(String[] args) {

		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

		if (f.exists()) {
			FileWriter fw = null;
			try {
				
				fw = new FileWriter(f, true);
				fw.write("\nThis is an appended line.");
				System.out.println("Line appended successfully!");
			} catch (IOException e) {
				System.out.println("An error occurred while appending.");
				e.printStackTrace();
			} finally {
				try {
					if (fw != null)
						fw.close();
				} catch (IOException e) {
					System.out.println("Error while closing the FileWriter.");
				}
			}
		} else {
			System.out.println("File NOT found!");
		}
	}
}
