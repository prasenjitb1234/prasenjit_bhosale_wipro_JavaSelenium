package day_5_assignment.encapsulation;

import java.util.ArrayList;
import java.util.List;

//3. Advanced: Bank Account with Deposit/Withdraw Logic
//Transaction validation and encapsulation protection.
//•	Create a BankAccount class with private accountNumber, accountHolder, balance.
//•	Provide:
//o	deposit(double amount) — ignores or rejects negative.
//o	withdraw(double amount) — prevents overdraft and returns a boolean success.
//o	Getter for balance but no setter.
//•	Optionally override toString() to display masked account number and details.
//•	Track transaction history internally using a private list (or inner class for transaction object).
//•	Expose a method getLastTransaction() but do not expose the full internal list.

class BankAccount {

	private String accountNumber;
	private String accountHolder;
	private double balance;

	private List<Transaction> transactions = new ArrayList<>();

	private class Transaction {
		private String type;
		private double amount;

		public Transaction(String type, double amount) {
			this.type = type;
			this.amount = amount;
		}

		public String toString() {
			return type + ": " + amount;
		}
	}

	public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		if (initialBalance >= 0) {
			this.balance = initialBalance;
		} else {
			this.balance = 0;
			System.out.println("Invalid initial balance. Set to 0.");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactions.add(new Transaction("Deposit", amount));
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			transactions.add(new Transaction("Withdraw", amount));
			System.out.println("Withdrew: " + amount);
			return true;
		} else {
			System.out.println("Withdrawal failed: Invalid amount or insufficient funds.");
			return false;
		}
	}

	public double getBalance() {
		return balance;
	}

	private String getMaskedAccountNumber() {
		if (accountNumber.length() > 4) {
			return "****" + accountNumber.substring(accountNumber.length() - 4);
		}
		return accountNumber;
	}

	public String getLastTransaction() {
		if (!transactions.isEmpty()) {
			return transactions.get(transactions.size() - 1).toString();
		}
		return "No transactions yet.";
	}

	public void displayDetails() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + getMaskedAccountNumber());
		System.out.println("Balance: " + balance);
		System.out.println("Last Transaction: " + getLastTransaction());
	}

	public String toString() {
		return "BankAccount[Holder=" + accountHolder + ", Account=" + getMaskedAccountNumber() + ", Balance=" + balance
				+ "]";
	}
}

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("1234567890", "Prasenjit", 5000);

		account.displayDetails();
		System.out.println("----------");

		account.deposit(2000);
		account.withdraw(1500);
		account.withdraw(6000); // this fails

		System.out.println("----------");
		account.displayDetails();
	}
}
