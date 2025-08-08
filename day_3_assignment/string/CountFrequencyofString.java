package day_3_assignment.string;

import java.util.HashMap;

public class CountFrequencyofString {
	public static void main(String[] args) {
		
//		Write a program to find the frequency of each character in a string \
		
		
		String str = "Programming";
		
		str = str.toLowerCase();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		// Printing  character frequencies
				for (char key : map.keySet()) {
					System.out.println(key + " : " + map.get(key));
				}
		
		
	}
}
