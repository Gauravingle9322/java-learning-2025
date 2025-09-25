// MultipleCatchDemo.java
// Demonstrates multiple catch blocks in Java

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];

            // ArithmeticException
            int num = 10 / 0;

            // ArrayIndexOutOfBoundsException
            arr[5] = 50;

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        System.out.println("Program continues after exception handling...");
    }
}
