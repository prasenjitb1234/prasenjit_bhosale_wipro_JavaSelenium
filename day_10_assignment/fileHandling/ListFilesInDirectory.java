package day_10_assignment.fileHandling;

import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling");

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files != null && files.length > 0) {
                System.out.println("Files in directory " + dir.getAbsolutePath() + ":");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path or directory does not exist.");
        }
    }
}
