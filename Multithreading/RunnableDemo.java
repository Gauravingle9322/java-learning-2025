
// Demonstrates creating threads by implementing Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        // Create Runnable object
        MyRunnable task = new MyRunnable();

        // Wrap Runnable in Thread objects
        Thread t1 = new Thread(task, "Task-1");
        Thread t2 = new Thread(task, "Task-2");

        // Start both threads
        t1.start();
        t2.start();

        System.out.println("Main thread finished launching tasks...");
    }
}
