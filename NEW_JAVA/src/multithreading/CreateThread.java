package multithreading;

class Way1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread(Way1) is running...");
        System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
    }
}

class Way2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread(Way2) is running...");
    }
}

public class CreateThread {
    public static void main(String[] args) {
        //        Way1 one = new Way1();Add commentMore actions
//        System.out.println(one.getName() + ", " + one.getState());
//        one.start();
//        System.out.println(one.getName() + ", " + one.getState());
//        Way2 two = new Way2();
//        two.run();

        Thread three = new Thread("benami");
        three.start();
        System.out.println(three.getName() + ", " + three.getState());
        three.run();
        System.out.println(three.getName() + ", " + three.getState());
        three.interrupt();
        System.out.println(three.getName() + ", " + three.getState());
    }
}
