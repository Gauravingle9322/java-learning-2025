
// Demonstrates the use of finally block in Java

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // this will cause ArithmeticException
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            // finally block always executes
            System.out.println("Finally block executed: Closing resources or cleanup tasks.");
        }

        System.out.println("Program continues after try-catch-finally...");
    }
}
