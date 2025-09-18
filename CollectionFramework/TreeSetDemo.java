
// Demonstrates basic operations with TreeSet in Java
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet stores elements in sorted order
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("TreeSet elements (sorted): " + numbers);

        // Removing element
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);

        // Checking if element exists
        System.out.println("Contains 20? " + numbers.contains(20));

        // First and Last elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        // Iterating
        System.out.println("Iterating TreeSet:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
