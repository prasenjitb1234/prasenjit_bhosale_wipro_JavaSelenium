package day_3_assignment.string;

public class CountWordsInASentence {
	public static void main(String[] args) {
		
		String str = "My name is Prasenjit Bhosale";
		
		String words[] = str.split(" ");
		
		int count = words.length;
		
		System.out.println("Total words: " + count);
		
		
		
	}
}
