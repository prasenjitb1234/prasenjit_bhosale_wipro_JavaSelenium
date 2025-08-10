package day_7_assignment.multithreading;

// 15  Create a program where one thread prints A-Z and another prints 1-26 alternately.

class Printer {
    private boolean isLetterTurn = true;

    public synchronized void printLetter(char letter) throws InterruptedException {
        while (!isLetterTurn) {
            wait();
        }
        System.out.print(letter + " ");
        isLetterTurn = false;
        notify();
    }

    public synchronized void printNumber(int number) throws InterruptedException {
        while (isLetterTurn) {
            wait();
        }
        System.out.print(number + " ");
        isLetterTurn = true;
        notify();
    }
}

class LetterThread extends Thread {
    private Printer printer;

    public LetterThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        try {
            for (char c = 'A'; c <= 'Z'; c++) {
                printer.printLetter(c);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class NumberThread extends Thread {
    private Printer printer;

    public NumberThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 26; i++) {
                printer.printNumber(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class AlternatePrintDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        LetterThread t1 = new LetterThread(printer);
        NumberThread t2 = new NumberThread(printer);

        t1.start();
        t2.start();
    }
}
