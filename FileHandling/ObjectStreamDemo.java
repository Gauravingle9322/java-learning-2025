import java.io.*;

// Serializable class
class Student implements Serializable {
    int id;
    String name;
    transient double marks; // transient field will not be serialized

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class ObjectStreamDemo {
    public static void main(String[] args) {

        // Object to be serialized
        Student s1 = new Student(1, "Gaurav", 95.5);

        // Step 1: Serialization (writing object to file)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s1);
            System.out.println(" Object serialized and saved to student.ser");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Step 2: Deserialization (reading object from file)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("\n Object deserialized successfully!");
            System.out.println("Deserialized object data:");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
