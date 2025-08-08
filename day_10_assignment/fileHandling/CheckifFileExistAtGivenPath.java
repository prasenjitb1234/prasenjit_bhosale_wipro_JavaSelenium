package day_10_assignment.fileHandling;

import java.io.File;

public class CheckifFileExistAtGivenPath {
//	•	2. Write a program to check whether a file exists at a given path.
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling/test.txt");
		
		if(f.exists()) {
			System.out.println("File Found at : "+f.getAbsolutePath());
		}
		else {
			System.out.println("File NOT Found");
		}
	}
}
