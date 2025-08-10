package day_10_assignment.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//13. Write a program to create, move, and delete a file using Files and Paths.
public class CreateMoveDeleteFile {
    public static void main(String[] args) {
        try {
           // / create file
            Path originalPath = Paths.get("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\myFile.txt");
            Files.createFile(originalPath);
            System.out.println("File created: " + originalPath);

            // MOVE file
            Path movedPath = Paths.get("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\myFileMoved.txt");
            Files.move(originalPath, movedPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to: " + movedPath);

            // delete file
            Files.deleteIfExists(movedPath);
            System.out.println("File deleted: " + movedPath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
