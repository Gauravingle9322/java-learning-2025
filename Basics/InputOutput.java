
// Demonstrates taking user input and displaying output using Scanner in Java

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered integer: " + num);

        // Taking double input
        System.out.print("Enter a decimal number: ");
        double d = sc.nextDouble();
        System.out.println("You entered double: " + d);

        // Taking string input (word)
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println("You entered word: " + word);

        // Taking full line input
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine();
        System.out.println("You entered sentence: " + line);

        // Close Scanner
        sc.close();
    }
}
/* Sample Output:
 * Enter an integer: 25
 * You entered integer: 25
 * Enter a decimal number: 12.5
 * You entered double: 12.5
 * Enter a word: Java
 * You entered word: Java
 * Enter a full sentence: Java is powerful
 * You entered sentence: Java is powerful
 * 
 */