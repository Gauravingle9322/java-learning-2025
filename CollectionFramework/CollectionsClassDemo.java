
// Demonstrates utility methods from Collections class in Java
import java.util.*;

public class CollectionsClassDemo {
    public static void main(String[] args) {
        // Create a list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        // Sorting list
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reversing list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Shuffling list
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        // Finding max and min
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));

        // Frequency of element
        numbers.add(20);
        System.out.println("Frequency of 20: " + Collections.frequency(numbers, 20));
    }
}
