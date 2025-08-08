package day_4_assignment.polymorphism;

class Bank {
	double getInterestRate() {
		return 0.0;
	}
}

class SBI extends Bank {
	double getInterestRate() {
		return 6.7;
	}
}

class ICICI extends Bank {

	double getInterestRate() {
		return 7.0;
	}
}

class HDFC extends Bank {

	double getInterestRate() {
		return 7.5;
	}
}

public class BankDemo {
	public static void main(String[] args) {

		SBI sbi = new SBI();
		System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");

		ICICI icici = new ICICI();
		System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");

		HDFC hdfc = new HDFC();
		System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");

	}
}
