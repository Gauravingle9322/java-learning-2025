
// Demonstrates basic HashMap operations

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Gaurav");
        students.put(102, "Rohit");
        students.put(103, "Sneha");
        students.put(101, "Amit"); // duplicate key → value replaced

        System.out.println("Students Map: " + students);

        // Access value by key
        System.out.println("Student with roll 102: " + students.get(102));

        // Remove entry
        students.remove(103);
        System.out.println("After removal: " + students);

        // Iterate using entrySet
        System.out.println("Iterating HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
