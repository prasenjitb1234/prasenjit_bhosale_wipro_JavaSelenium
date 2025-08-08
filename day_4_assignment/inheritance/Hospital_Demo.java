package day_4_assignment.inheritance;

// Question 3.	
// Create Hospital super class and access this class inside the Patient child class 
// and access properties from Hospital class.

class Hospital 
{
	void hospitalName(String name) {
		System.out.println("Hospital Name : " + name);
	}

	void location(String city) {
		System.out.println("Hospital Location : " + city);
	}
}

class Patient extends Hospital 
{
	void patientName(String pname) {
		System.out.println("Patient Name : " + pname);
	}

	void patientAge(int age) {
		System.out.println("Patient Age : " + age);
	}

	void disease(String illness) {
		System.out.println("Disease : " + illness);
	}
}

public class Hospital_Demo {
	public static void main(String[] args) {

		System.out.println("Patient Details  : ");
		Patient p = new Patient();

		p.hospitalName("D.Y Patil Hospital ");
		p.location("Mumbai");
		p.patientName("Ram Sharma");
		p.patientAge(45);
		p.disease("Diabetes");

	}
}
