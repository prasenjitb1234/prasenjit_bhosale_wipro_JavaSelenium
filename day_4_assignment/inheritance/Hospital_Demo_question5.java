package day_4_assignment.inheritance;

public class Hospital_Demo_question5 {

	class Hospital {
		void location(String location) {
			System.out.println("Location is : " + location);
		}
	}

	class Doctor extends Hospital {
		void DoctorInfo(String name, int id) {
			System.out.println("Doctor name is : " + name + " And Doctor id is : " + id);
		}
	}

	class Gynac extends Doctor {
		void treatPatient(String treats) {
			System.out.println("Task : " + treats);
		}
	}

	class Endo extends Doctor {
		void treatPatient(String treats) {
			System.out.println("Takes care of older people and diabetes");
		}
	}

	class Nurse extends Hospital {
		void NurseInfo(String name, int id) {
			System.out.println("Nurse Name is : " + name + " and Nurse Id is : " + id);
		}

		void assist(String task) {
			System.out.println("Help Doctor : " + task);
		}
	}

	class Accountant extends Hospital {
		void AccountantInfo(String name) {
			System.out.println("Account Name : " + name);
		}

		void task(String work) {
			System.out.println("Manage all expenses");
		}
	}

	class Payments extends Accountant {
		void paymentDetails(String PaymentInfo) {
			System.out.println("Payment info is : " + PaymentInfo);
		}
	}

	class Documentation extends Accountant {
		void documentDetails(String docInfo) {
			System.out.println("Document info is : " + docInfo);
		}
	}

	public static void main(String[] args) {

		Hospital_Demo_question5 outer = new Hospital_Demo_question5();

		System.out.println("********Gynac : ***********");
		Gynac gc = outer.new Gynac();
		gc.DoctorInfo("Tony Stark", 101);
		gc.location("Mumbai");
		gc.treatPatient("Takes care of women");

		System.out.println("********Payment : ***********");
		Payments pt = outer.new Payments();
		pt.AccountantInfo("Peter Parker");
		pt.location("Mumbai");
		pt.paymentDetails("Paid some money ... ");
		pt.task("Calculate ...money or stuff ");
	}
}
