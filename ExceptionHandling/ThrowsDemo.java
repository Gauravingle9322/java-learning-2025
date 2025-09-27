
// Demonstrates the use of 'throws' keyword in Java

import java.io.*;

public class ThrowsDemo {

    // Method that declares an exception using 'throws'
    static void readFile() throws IOException {
        // Trying to open a file which may not exist
        FileReader fr = new FileReader("sample.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println("First line of file: " + br.readLine());

        br.close();
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile(); // calling method that throws IOException
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read");
        }

        System.out.println("Program continues after handling exception...");
    }
}
