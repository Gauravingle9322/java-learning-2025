// this keyword → current object refer karayla use hoto

// static keyword → class-level variables & methods (shared by all objects)


class Student {
    String name;
    int age;
    static String college = "ASM College"; // static variable

    // Constructor using 'this'
    Student (String name, int age) {
        this.name = name; // 'this' points to current object's variable
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }
}

public class ThisAndStaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav", 21);
        Student s2 = new Student("Anand", 22);

        s1.displayInfo();
        s2.displayInfo();

        // Changing static variable (affects all objects)
        Student.changeCollege("Pune University");

        s1.displayInfo();
        s2.displayInfo();
    }
}
