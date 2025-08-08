package day_3_assignment.string;

public class ReplaceAllSpacesWithHyphens {
	public static void main(String[] args) {
		
		String str = "     Hello      ";
		
		System.out.println("Before replacing space with hyphen : "+str);
		str = str.replaceAll("\\s", "-");
		

		System.out.println("After replacing space with hyphen : "+str);
		
		
		
	}
}
