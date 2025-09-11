class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        System.out.println("Default constructor called!");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        System.out.println("Parameterized constructor called!");
        name = n;
        age = a;
    }

    // Constructor Overloading
    Student(String n) {
        System.out.println("Overloaded constructor called!");
        name = n;
        age = 18; // default age
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        // Default Constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized Constructor
        Student s2 = new Student("Gaurav", 21);
        s2.display();

        // Overloaded Constructor
        Student s3 = new Student("Anand");
        s3.display();
    }
}
