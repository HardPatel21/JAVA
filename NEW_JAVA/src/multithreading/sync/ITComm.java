package multithreading.sync;

import javax.crypto.CipherSpi;

class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + ": going to withdraw...");

        if (this.amount < amount) {
            System.out.println(Thread.currentThread().getName() + ": Less balance; waiting for deposit...");
            try {
                wait(); // releases the lock
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.amount -= amount;
        System.out.println(Thread.currentThread().getName() + ": withdraw completed...");
        notify();   // convert a waiting thread into an active thread
    }

    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + ": going to deposit...");
        this.amount += amount;
        System.out.println(Thread.currentThread().getName() + ": deposit completed...");
        notify();
    }
}


public class ITComm {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread() {
            @Override
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}