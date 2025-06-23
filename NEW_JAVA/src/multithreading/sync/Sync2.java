package multithreading.sync;

class Table2 {
    synchronized static void printTable(int n) {   //static synchronized method
        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyThread01 extends Thread {
    public void run() {
        Table2.printTable(1);
    }
}

class MyThread02 extends Thread {
    public void run() {
        Table2.printTable(2);
    }
}

class MyThread03 extends Thread {
    public void run() {
        Table2.printTable(3);
    }
}

class MyThread04 extends Thread {
    public void run() {
        Table2.printTable(4);
    }
}

public class Sync2 {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();
        MyThread02 t2 = new MyThread02();
        MyThread03 t3 = new MyThread03();
        MyThread04 t4 = new MyThread04();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}