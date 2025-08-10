package day_10_assignment.fileHandling;

import java.io.File;
import java.io.FilenameFilter;

//	9. Write a program to filter and display only .txt files from a folder using FilenameFilter.

public class OnlyShowTextFilesInFolder {

    public static void main(String[] args) {

        
        String directoryPath = "C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling";

        File directory = new File(directoryPath);

      
        if (directory.isDirectory()) {

            
            FilenameFilter txtFilter = new FilenameFilter() {
               
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".txt");
                }
            };

           
            String[] txtFiles = directory.list(txtFilter);

            if (txtFiles != null && txtFiles.length > 0) {
                System.out.println("text files in " + directoryPath + ":");
                for (String fileName : txtFiles) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("No .txt files found in the directory.");
            }

        } else {
            System.out.println("The provided path is not a directory.");
        }
    }
}
