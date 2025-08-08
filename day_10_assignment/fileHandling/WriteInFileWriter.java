package day_10_assignment.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFileWriter {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

		if (f.exists()) {
			try (FileWriter fw = new FileWriter(f)) {
				fw.write("Hello, World!");
				System.out.println("Successfully wrote into the file.");
			} catch (IOException e) {
				System.out.println("An error occurred while writing in file");
				e.printStackTrace();
			}
		} else {
			System.out.println("File NOT found!");
		}
	}
}
