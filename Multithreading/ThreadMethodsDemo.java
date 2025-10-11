
// Demonstrates important thread methods: sleep(), join(), isAlive()

class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " started.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted!");
            }
        }
        System.out.println(getName() + " finished.");
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();

        System.out.println("Is Thread-A alive? " + t1.isAlive());

        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Is Thread-A alive after join? " + t1.isAlive());
        System.out.println("All threads have completed execution!");
    }
}
