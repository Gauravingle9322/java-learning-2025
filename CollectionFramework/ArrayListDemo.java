
// Demonstrates basic ArrayList operations

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicates allowed

        System.out.println("Fruits List: " + fruits);

        // Access element
        System.out.println("Second fruit: " + fruits.get(1));

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Iterate
        System.out.println("Iterating ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
