package day_10_assignment.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//	7. Write a program to copy content from one file to another using FileReader and FileWriter.

public class CopyFile {

	public static void main(String[] args) {
		File sourceFile = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\source.txt");
		File destFile = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\destination.txt");

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(sourceFile);
			fw = new FileWriter(destFile);

			int ch;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}

			System.out.println("File copied successfully!");

		} catch (IOException e) {
			System.out.println("An error occurred while copying the file.");
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				System.out.println("Error while closing files.");
			}
		}
	}
}
