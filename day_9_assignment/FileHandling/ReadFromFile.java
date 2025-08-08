package day_9_assignment.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException {

		BufferedReader r = new BufferedReader(
				new FileReader("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\student.txt"));

		ArrayList<String> lines = new ArrayList<>();

		String line;

		try {
			while ((line = r.readLine()) != null) {
				lines.add(line);
			}

			for (String l : lines) {
				System.out.println(l);
			}

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
