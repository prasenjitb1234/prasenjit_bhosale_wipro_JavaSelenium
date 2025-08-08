package day_9_assignment.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createAndWrite {

//	Q1. Create and Write to a File
//	Write a Java program to create a file named student.txt and 
//	write 5 lines of student names using FileWriter.

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\student.txt");

		if (!f.exists()) {
			f.createNewFile();
			System.out.println("File Crated Successfylly");

		} else {
			System.out.println("file already Exist !");
		}

		FileWriter fw = new FileWriter("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\student.txt");

		fw.write("Prasenjit \n");

		fw.write("Peter \n");
		fw.write("Ben \n");
		fw.write("Dhruv \n");
		fw.write("Aditya \n");

		fw.close();
		System.out.println("Data written successfully!");

	}
}
