package day_8_assignment.hashset;

import java.util.HashSet;
import java.util.Iterator;

// 2. Perform operations on HashSet: remove, check existence, clear

public class HashSetOperationsDemo {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Satara");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        System.out.println("Original HashSet: " + cities);

        
        boolean removed = cities.remove("Nagpur");
        if (removed) {
            System.out.println("City 'Satara' removed successfully.");
        } else {
            System.out.println("City 'Satara' not found in HashSet.");
        }

        
        String cityToCheck = "Pune";
        if (cities.contains(cityToCheck)) {
            System.out.println("City '" + cityToCheck + "' exists in HashSet.");
        } else {
            System.out.println("City '" + cityToCheck + "' does not exist in HashSet.");
        }

        
        cities.clear();
        System.out.println("HashSet cleared.");

        
        if (cities.isEmpty()) {
            System.out.println("HashSet is now empty.");
        } else {
            System.out.println("HashSet is not empty.");
        }
    }
}
