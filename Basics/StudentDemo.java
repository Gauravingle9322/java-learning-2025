// Class Definition
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main Class
public class StudentDemo {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.displayInfo();

        // Using parameterized constructor
        Student s2 = new Student("Gaurav", 21);
        s2.displayInfo();

        Student s3 = new Student("Anand", 22);
        s3.displayInfo();
    }
}
