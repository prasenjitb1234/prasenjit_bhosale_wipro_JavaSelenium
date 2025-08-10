package day_5_assignment.Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

//6.	 Sort Strings by Length or Alphabetically

public class SortStrings {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "apple", "kiwi", "grape", "orange");

        // sorting by length 
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by length: " + words);

        // sort alphabetically 
        words.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Sorted alphabetically: " + words);
    }
}
