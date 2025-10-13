
// Demonstrates wait(), notify(), and notifyAll() using producer-consumer example

class Data {
    private int value;
    private boolean hasValue = false;

    // Producer will set data
    public synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait(); // wait until consumer consumes the value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        hasValue = true;
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    // Consumer will get data
    public synchronized void consume() {
        while (!hasValue) {
            try {
                wait(); // wait until producer produces something
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        hasValue = false;
        notify(); // notify producer
    }
}

class Producer extends Thread {
    private Data data;

    Producer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Data data;

    Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        Data data = new Data();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}
