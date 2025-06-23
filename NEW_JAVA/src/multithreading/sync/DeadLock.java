package multithreading.sync;

//DeadLock Solution
public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Chocolate 1";
        final String resource2 = "Chocolate 2";

        Thread t1 = new Thread("Himanshu") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        Thread t2 = new Thread("Tusharth") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

/*
public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Chocolate 1";
        final String resource2 = "Chocolate 2";

        Thread t1 = new Thread("Himanshu") {
            public void run() {
                synchronized(resource1) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource2) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    }
                }
            }
        };

        Thread t2 = new Thread("Tusharth") {
            public void run() {
                synchronized(resource2) {
                    System.out.println(Thread.currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized(resource1) {
                        System.out.println(Thread.currentThread().getName() + " got " + resource1);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
*/

// Deadlock problem: When a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object that is got by first thread.