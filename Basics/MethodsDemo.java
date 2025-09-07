public class MethodsDemo {
    // 1. Simple method without parameters
    static void greet() {
        System.out.println("Hello, welcome to Java Methods!");
    }

    // 2. Method with parameters
    static int add(int a, int b) {
        return a + b;
    }

    // 3. Method returning a value
    static int square(int n) {
        return n * n;
    }

    // 4. Method overloading (same name, different parameters)
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    // Main Method
    public static void main(String[] args) {
        greet();

        System.out.println("Addition of 5 and 10 = " + add(5, 10));
        System.out.println("Square of 7 = " + square(7));

        System.out.println("Multiplication (int): " + multiply(3, 4));
        System.out.println("Multiplication (double): " + multiply(2.5, 4.2));
    }
}
