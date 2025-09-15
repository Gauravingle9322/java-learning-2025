// File: LinkedListDemo.java
// Demonstrates basic LinkedList operations

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // Add elements
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nagpur");
        cities.addFirst("Delhi"); // add at beginning
        cities.addLast("Bangalore"); // add at end

        System.out.println("Cities List: " + cities);

        // Access elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        // Remove elements
        cities.remove("Nagpur");
        cities.removeFirst();
        System.out.println("After removals: " + cities);

        // Iterate LinkedList
        System.out.println("Iterating LinkedList:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
