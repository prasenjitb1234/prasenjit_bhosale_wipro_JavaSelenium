package day_10_assignment.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewTextFile {
	
//	•	1. Write a program to create a new text file named test.txt.
	
	public static void main(String[] args) {
		
	File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling/test.txt");	
		
	try {
		f.createNewFile();
		f.setWritable(true);
		System.out.println("File Created Successfully !");
		
	}
	catch(IOException e) {
		System.out.println("File NOT Found");
		System.out.println(e);
	}
		
		
		
		
	}
}
