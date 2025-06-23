package multithreading.sync;

class Table {
    synchronized void printTable(int n) {   //synchronized method
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

//class Table {
//    void printTable(int n) {
//        synchronized(this) {
//            for(int i=1; i<=10; i++) {
//                System.out.println(n + " * " + i + " = " + n*i);
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {
//                     System.out.println(e.getMessage());
//                }
//            }
//        }
//    }
//}

class MyThread1 extends Thread {
    Table t;
    int n;

    MyThread1(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    @Override
    public void run() {
        t.printTable(n);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(2);
    }
}

public class Sync1 {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread1 t1 = new MyThread1(t, 1);
        MyThread2 t2 = new MyThread2(t);

        t1.start();
        t2.start();
    }
}