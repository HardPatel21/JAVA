package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThreads implements Runnable {
    private String message;

    public WorkerThreads(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) message: " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=0; i<100; i++) {
            Runnable worker = new WorkerThreads("" + i);
            executor.execute(worker);
        }
        executor.shutdown();

        while(!executor.isTerminated()) {}

        System.out.println("Finished all Threads");
    }
}