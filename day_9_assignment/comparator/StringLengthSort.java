package day_9_assignment.comparator;

import java.util.*;

//Q10. Use an anonymous inner class to sort a list of strings by length.

public class StringLengthSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Pune","Satara",  "Bangalore", "Delhi", "Mumbai", "Hyderabad"));

        System.out.println("Before Sorting:");
        list.forEach(System.out::println);

        // Using anonymous inner class
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("\nAfter Sorting by Length:");
        list.forEach(System.out::println);
    }
}
