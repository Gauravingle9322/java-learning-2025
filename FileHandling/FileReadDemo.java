
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("sample.txt");
            int data;
            System.out.println("Reading file content:\n");

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();
            System.out.println("\n\nFile reading completed successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
