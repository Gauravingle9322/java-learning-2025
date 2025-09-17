
// Demonstrates use of 'super' keyword in Java

// Parent class
class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // calling parent constructor
        System.out.println("Dog constructor called");
    }

    void sound() {
        super.sound(); // calling parent method
        System.out.println("Dogs bark");
    }

    void showNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name); // accessing parent variable
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.showNames();
    }
}
