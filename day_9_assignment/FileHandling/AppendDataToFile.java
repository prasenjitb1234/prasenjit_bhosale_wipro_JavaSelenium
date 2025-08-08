package day_9_assignment.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Q3. Append Data to a File
//Write a Java program to append a new student name to the existing student.txt file 
//without overwriting existing data.

public class AppendDataToFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\student.txt");

		if (f.exists()) {
			try (FileWriter fw = new FileWriter(f, true)) { 
				fw.write("New Student: Doraemon\n");
				fw.write("New Student: Shinchan\n");
				System.out.println("Data appended successfully!");
			} catch (IOException e) {
				System.out.println("An error occurred: " + e.getMessage());
			}
		} else {
			System.out.println("File does not exist. Please create it first.");
		}
	}
}