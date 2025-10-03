// NestedTryDemo.java
public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            // outer try block
            System.out.println("Outer try block starts");

            try {
                // inner try block
                int arr[] = { 10, 20, 30 };
                System.out.println("Array element: " + arr[5]); // ArrayIndexOutOfBounds
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }

            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues after nested try-catch...");
    }
}
