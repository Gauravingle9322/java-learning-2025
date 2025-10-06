
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            // FileWriter object create
            FileWriter writer = new FileWriter("output.txt");

            // Writing data to file
            writer.write("Hello Java!\n");
            writer.write("This is FileWriter demo.\n");
            writer.write("File writing successful!");

            // Close the file
            writer.close();
            System.out.println("Data successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
