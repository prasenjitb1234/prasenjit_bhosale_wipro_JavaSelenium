package day_5_assignment.encapsulation;

//4. Inner Class Encapsulation: Secure Locker

//Encapsulate helper logic inside the class.
//•	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
//•	Use an inner private class SecurityManager to handle passcode verification logic.
//•	Only expose public methods: lock(), unlock(String code), isLocked().
//•	Password attempts should not leak verification logic externally—only success/failure.
//•	Ensure no direct access to passcode or the inner SecurityManager from outside.

class Locker {

	private String lockerId;
	private boolean isLocked;
	private String passcode;

	private class SecurityManager {
		private boolean verifyPasscode(String code) {
			return passcode.equals(code);
		}
	}

	public Locker(String lockerId, String passcode) {
		this.lockerId = lockerId;
		this.passcode = passcode;
		this.isLocked = true;
	}

	public void lock() {
		if (!isLocked) {
			isLocked = true;
			System.out.println("Locker " + lockerId + " is now locked.");
		} else {
			System.out.println("Locker " + lockerId + " is already locked.");
		}
	}

	public void unlock(String code) {
		SecurityManager sm = new SecurityManager();
		if (isLocked) {
			if (sm.verifyPasscode(code)) {
				isLocked = false;
				System.out.println("Locker " + lockerId + " unlocked successfully.");
			} else {
				System.out.println("Incorrect passcode. Locker remains locked.");
			}
		} else {
			System.out.println("Locker " + lockerId + " is already unlocked.");
		}
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void displayStatus() {
		System.out.println("Locker ID: " + lockerId);
		System.out.println("Status: " + (isLocked ? "Locked" : "Unlocked"));
	}
}

public class LockerDemo {
	public static void main(String[] args) {
		Locker locker = new Locker("L123", "mypassword");

		locker.displayStatus();
		System.out.println("----------");

		locker.unlock("wrongpass");
		locker.unlock("mypassword");
		System.out.println("Locked? " + locker.isLocked());

		System.out.println("----------");
		locker.lock();
		locker.displayStatus();
	}
}
