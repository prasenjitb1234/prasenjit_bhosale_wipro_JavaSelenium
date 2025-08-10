package day_5_assignment.Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//4.	Filter Even or Odd Numbers 

public class FilterEvenOdd {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);

        System.out.println("\nOdd Numbers:");
        numbers.stream()
               .filter(isOdd)
               .forEach(System.out::println);
    }
}
