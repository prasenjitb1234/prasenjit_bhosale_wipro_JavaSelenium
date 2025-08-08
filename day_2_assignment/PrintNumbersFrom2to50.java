package day_2_assignment;

public class PrintNumbersFrom2to50 {
	public static void main(String[] args) {
		// 1. print even numbers from 2 to 50
		
		for (int i = 2; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
