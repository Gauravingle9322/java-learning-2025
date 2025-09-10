// Defining a class
class Student {
    // Fields (attributes)
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class ClassObjectDemo {
    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.name = "Gaurav";
        s1.age = 21;
        s1.displayInfo();

        // Creating second object
        Student s2 = new Student();
        s2.name = "Anand";
        s2.age = 22;
        s2.displayInfo();
    }
}
