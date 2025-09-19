
// Demonstrates basic operations with TreeMap in Java
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap stores key-value pairs in sorted order of keys
        TreeMap<Integer, String> students = new TreeMap<>();

        // Adding key-value pairs
        students.put(3, "Rahul");
        students.put(1, "Amit");
        students.put(4, "Sneha");
        students.put(2, "Priya");

        System.out.println("TreeMap elements (sorted by keys): " + students);

        // Accessing values
        System.out.println("Student with key 2: " + students.get(2));

        // Removing entry
        students.remove(3);
        System.out.println("After removing key 3: " + students);

        // Checking if key/value exists
        System.out.println("Contains key 1? " + students.containsKey(1));
        System.out.println("Contains value 'Sneha'? " + students.containsValue("Sneha"));

        // First and Last entries
        System.out.println("First Entry: " + students.firstEntry());
        System.out.println("Last Entry: " + students.lastEntry());

        // Iterating TreeMap
        System.out.println("Iterating TreeMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}


//Output:

// TreeMap elements (sorted by keys): {1=Amit, 2=Priya, 3=Rahul, 4=Sneha}
// Student with key 2: Priya
// After removing key 3: {1=Amit, 2=Priya, 4=Sneha}
// Contains key 1? true
// Contains value 'Sneha'? true
// First Entry: 1=Amit
// Last Entry: 4=Sneha
// Iterating TreeMap:
// 1 => Amit
// 2 => Priya
// 4 => Sneha
