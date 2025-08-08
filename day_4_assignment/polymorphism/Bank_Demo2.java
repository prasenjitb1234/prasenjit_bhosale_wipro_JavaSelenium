package day_4_assignment.polymorphism;

//Question 2.
//Design an interface Bank with methods deposit(), withdraw(), and getBalance().
//Implement this in SavingsAccount and CurrentAccount classes.
//Use inheritance to create a base Account class.
//Demonstrate method overriding with customized logic for withdrawal 
//(e.g., minimum balance in SavingsAccount).

interface Bank1 {
	void deposit(double amount);

	void withdraw(double amount);

	double getBalance();
}

class Account implements Bank1 
{
	double balance;

	Account(double initialBalance) {
		balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited : " + amount);
	}

	public double getBalance() {
		return balance;
	}

	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn : " + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}
}

class SavingsAccount extends Account {
	private double minBalance = 500;

	SavingsAccount(double initialBalance) {
		super(initialBalance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= minBalance) {
			balance -= amount;
			System.out.println("Withdrawn from Savings : " + amount);
		} else {
			System.out.println("Cannot withdraw! Minimum balance of " + minBalance + " must be maintained.");
		}
	}
}

class CurrentAccount extends Account {
	CurrentAccount(double initialBalance) {
		super(initialBalance);
	}

	@Override
	public void withdraw(double amount) {
		
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn from Current : " + amount);
		} else {
			System.out.println("Insufficient Balance in Current Account!");
		}
	}
}

public class Bank_Demo2 {
	public static void main(String[] args) {

		System.out.println("*** Savings Account ***");
		SavingsAccount sa = new SavingsAccount(2000);
		sa.deposit(1000);
		sa.withdraw(2300); 
		sa.withdraw(1000); 
		System.out.println("Savings Balance : " + sa.getBalance());

		System.out.println("\n Current Account :  ");
		CurrentAccount ca = new CurrentAccount(3000);
		ca.deposit(2000);
		ca.withdraw(4000); 
		ca.withdraw(2000); 
		System.out.println("Current Balance : " + ca.getBalance());
	}
}
