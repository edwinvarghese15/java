import java.util.*;
public class MultiThreadDemo {
    public static void main(String[] args) {
        
        TableThread tableThread = new TableThread();
        PrimeThread primeThread = new PrimeThread(10); 

       
        tableThread.start();
        primeThread.start();
    }
}

class TableThread extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("TableThread interrupted");
            }
        }
    }
}


class PrimeThread extends Thread {
    private int count;

    public PrimeThread(int count) {
        this.count = count;
    }

    public void run() {
        System.out.println("First " + count + " Prime Numbers:");
        int num = 2, printed = 0;
        while (printed < count) {
            if (isPrime(num)) {
                System.out.println(num);
                printed++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("PrimeThread interrupted");
                }
            }
            num++;
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

