
// Demonstrates the use of 'throw' keyword in Java

public class ThrowDemo {

    // Method that throws an exception manually
    static void checkAge(int age) {
        if (age < 18) {
            // throwing an exception explicitly
            throw new ArithmeticException("Access denied: Age must be 18 or above");
        } else {
            System.out.println("Access granted: You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // will throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
