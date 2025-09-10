// Removed package declaration to match the default package

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n--- Multilevel Inheritance ---");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
