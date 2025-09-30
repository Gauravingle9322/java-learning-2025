
// Demonstrates user-defined (custom) exceptions in Java

// Step 1: Create a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Step 2: Method that throws custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age: You must be 18 or older to vote");
        } else {
            System.out.println("Valid Age: You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // will throw custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling custom exception...");
    }
}
