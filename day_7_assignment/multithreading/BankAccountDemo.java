package day_7_assignment.multithreading;

// 13 BankAccount with synchronized deposit and withdraw accessed by multiple threads

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance: " + balance);
    }

    public synchronized boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance: " + balance);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw " + amount + ", insufficient balance: " + balance);
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankUser extends Thread {
    private BankAccount account;

    public BankUser(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(1000);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            account.withdraw(500);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(5000);

        BankUser user1 = new BankUser(account);
        user1.setName("Prasenjit");

        BankUser user2 = new BankUser(account);
        user2.setName("Peter");

        user1.start();
        user2.start();

        user1.join();
        user2.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}
