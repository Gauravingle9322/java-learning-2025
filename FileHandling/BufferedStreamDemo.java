
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        // Step 1: Write data to file using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_output.txt"))) {
            bw.write("Hello from BufferedStreamDemo!\n");
            bw.write("This file is written using BufferedWriter.\n");
            bw.write("Buffered streams improve performance.");
            System.out.println("Data written to buffered_output.txt successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Step 2: Read data from the same file using BufferedReader
        System.out.println("\nReading from buffered_output.txt:\n");
        try (BufferedReader br = new BufferedReader(new FileReader("buffered_output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nFile reading completed!");
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
