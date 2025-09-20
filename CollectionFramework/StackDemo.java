
// Demonstrates basic operations with Stack in Java

import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Initial Stack: " + stack);

        // Popping element from the stack (LIFO)
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // Peeking top element
        int top = stack.peek();
        System.out.println("Top element (peek): " + top);

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching element
        System.out.println("Position of 20 in stack: " + stack.search(20));

        // Iterating through stack
        System.out.println("Iterating through stack:");
        for (int num : stack) {
            System.out.println(num);
        }
    }
}
