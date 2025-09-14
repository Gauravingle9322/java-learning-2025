// Demonstrates basic HashSet operations
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate ignored

        System.out.println("Fruits Set: " + fruits);

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Iterate
        System.out.println("Iterating HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
