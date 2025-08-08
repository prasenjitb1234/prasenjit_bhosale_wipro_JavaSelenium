package day_3_assignment.string;

public class CountNumberofVowelsInAString {
	// count number of vowels in a String
	
	public static void main(String[] args) {
		
		String str = "Programming";
		
		int count = 0;
		
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u') {
				count++;
			}
		}
		
		System.out.println("Vowel count : " + count);
		
	}
}
