package day_3_assignment.string;

public class RemoveAllWhiteSpacesFromString {
	public static void main(String[] args) {
		
//		Write a program to remove all white Spaces from string 
		
		String str = "My Name is Prasenjit";
		
		str = str.replaceAll(" ", "");
		
		System.out.println("Atter removing white spaces : "+str);
		
		
	}
}
