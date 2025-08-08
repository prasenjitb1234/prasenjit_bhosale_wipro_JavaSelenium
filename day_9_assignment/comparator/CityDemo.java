package day_9_assignment.comparator;

import java.util.*;

//Q9. Write a program that sorts a list of cities by population using Comparator.

class City {
	String name;
	int population;

	City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	@Override
	public String toString() {
		return name + " - Population: " + population;
	}
}

public class CityDemo {
	public static void main(String[] args) {
		ArrayList<City> cities = new ArrayList<>();

		cities.add(new City("Mumbai", 20411000));
		cities.add(new City("Delhi", 16787941));
		cities.add(new City("Bangalore", 8443675));
		cities.add(new City("Pune", 3124458));

		System.out.println("Before Sorting:");
		cities.forEach(System.out::println);

		// Sort by population (ascending)
		cities.sort(Comparator.comparingInt(c -> c.population));

		System.out.println("\nSorted by Population (Ascending):");
		cities.forEach(System.out::println);

		// Sort by population (descending)
		cities.sort(Comparator.comparingInt((City c) -> c.population).reversed());

		System.out.println("\nSorted by Population (Descending):");
		cities.forEach(System.out::println);
	}
}
