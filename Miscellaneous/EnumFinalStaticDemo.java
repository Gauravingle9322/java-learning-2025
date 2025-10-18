
// Demonstrates use of enum, final keyword, and static block in Java

// Enum example
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumFinalStaticDemo {

    //  static variable and static block
    static int staticNumber;
    static {
        System.out.println("Static block executed before main()");
        staticNumber = 10;
    }

    //  final variable
    final double PI = 3.14159;

    public static void main(String[] args) {
        EnumFinalStaticDemo obj = new EnumFinalStaticDemo();

        System.out.println("\n--- Final Keyword Example ---");
        System.out.println("Value of final variable PI = " + obj.PI);

        System.out.println("\n--- Static Block & Variable Example ---");
        System.out.println("Static variable value: " + staticNumber);

        System.out.println("\n--- Enum Example ---");
        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);

        System.out.println("\nAll days in Enum:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
