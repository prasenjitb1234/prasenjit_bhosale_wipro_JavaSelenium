package day_4_assignment.inheritance;


class After_12th // super class
{
	
	void careerPath() {
		System.out.println("Choose your carreer after 12th ");
	}
	
}

class Engineering extends After_12th {
	
	void branchOptions() {
		System.out.println("Available options : IT, CS , Mechanical");
	}
}

class Medical extends After_12th{
	void medicalOptions() {
		System.out.println("You chose Medical. Available options: MBBS, BDS.");
	}
}

class IT extends Engineering{
	void courseDetails() {
		System.out.println("You are in IT Branch of Engineering.");
	}
}
class CS extends Engineering{
	void courseDetails() {
		System.out.println("You are in Computer Science Branch.");
	}
}
class Mechanical extends Engineering{
	void courseDetails() {
		System.out.println("You are in Mechanical Branch.");
	}
}

class MBBS extends Medical{
	void courseDetails() {
		System.out.println("You are studying MBBS.");
	}
}

class BDS extends Medical {
	void courseDetails() {
		System.out.println("You are studying BDS : Dental ");
	}
}


public class Career_Demo {
	public static void main(String[] args) {
		
		After_12th stud = new After_12th();
		stud.careerPath();
		
		System.out.println("--- Engineering Path --- ");
		CS csStudent = new CS();
		csStudent.branchOptions();
		csStudent.courseDetails();

		System.out.println(" \n --- Medical Path ---");
		MBBS medStudent = new MBBS();
		medStudent.medicalOptions();
		medStudent.courseDetails();
		
		
		
	}
}
