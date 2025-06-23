package multithreading;

class MyThread extends Thread {
    MyThread() {
        super();
    }

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        try {
            t1.join(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        t2.start();

    }
}