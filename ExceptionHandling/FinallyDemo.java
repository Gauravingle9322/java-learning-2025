// FinallyDemo.java
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int data = 10 / 0; // ArithmeticException
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("Finally block always executes (cleanup code here).");
        }

        System.out.println("Program continues after try-catch-finally...");
    }
}
