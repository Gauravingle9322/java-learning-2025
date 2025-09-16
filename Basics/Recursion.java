
    // Demonstrates recursion in Java with factorial and Fibonacci series

   public class Recursion { 

        // Factorial using recursion
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // base case
            } else {
                return n * factorial(n - 1); // recursive call
            }
        }

        // Fibonacci using recursion
        static int fibonacci(int n) {
            if (n == 0)
                return 0; // base case
            if (n == 1)
                return 1; // base case
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
        }

        public static void main(String[] args) {
            int num = 5;

            // Factorial
            System.out.println("Factorial of " + num + " = " + factorial(num));

            // Fibonacci Series
            System.out.println("Fibonacci series up to " + num + " terms:");
            for (int i = 0; i < num; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

