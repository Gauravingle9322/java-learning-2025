// File: InterfaceDemo.java

// Interface declaration
interface Animal {
    void sound(); // abstract method

    void sleep(); // abstract method
}

// Dog class implementing Animal
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void sleep() {
        System.out.println("Dog sleeps peacefully...");
    }
}

// Cat class implementing Animal
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    public void sleep() {
        System.out.println("Cat sleeps quietly...");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog(); // upcasting
        dog.sound();
        dog.sleep();

        Animal cat = new Cat(); // upcasting
        cat.sound();
        cat.sleep();
    }
}
