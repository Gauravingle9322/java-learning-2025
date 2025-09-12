class Student {
    // private fields (data hiding)
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav", 21);

        // Display initial values
        s1.display();

        // Modify values using setters
        s1.setName("Anand");
        s1.setAge(25);

        // Display updated values
        s1.display();

        // Invalid update
        s1.setAge(-5);
    }
}
