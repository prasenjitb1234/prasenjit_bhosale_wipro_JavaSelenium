package day_1_assignment;

public class LoanApproval {
	public static void main(String[] args) {
//		* 2. write a program for loan approval
//		* first check if salary>25000
//		* then check if credit score >=700

		double salary = 30000;
		int creditScore = 720;

		if (salary > 25000) {
			if (creditScore >= 700) {
				System.out.println("Loan Approved");
			} else {
				System.out.println("Loan Denied: Low Credit Score");
			}
		} else {
			System.out.println("Loan Denied: Salary too low");
		}

	}
}
