package day_10_assignment.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//11. Write a program to read a file using Scanner and display the tokens.

public class ReadFileTokens {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\test.txt");

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Tokens in the file:");

            
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println(token);
            }

        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + file.getAbsolutePath());
        }
    }
}
