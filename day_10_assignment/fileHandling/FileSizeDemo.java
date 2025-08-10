package day_10_assignment.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//	18. Write a program to check and print the size of a file in bytes using Files.size().
public class FileSizeDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

        try {
            long size = Files.size(filePath);
            System.out.println("File size: " + size + " bytes");
        } catch (IOException e) {
            System.out.println("Error reading file size: " + e.getMessage());
        }
    }
}
