
// Demonstrates basic try-catch in Java

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // this will cause ArithmeticException
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        System.out.println("Program continues after exception handling...");
    }
}
