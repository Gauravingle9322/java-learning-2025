// WrapperClassesDemo.java
// Demonstrates autoboxing and unboxing in Java

public class WrapperClassesDemo {
    public static void main(String[] args) {
        //Autoboxing: converting primitive -> wrapper object
        int num = 10;
        Integer obj = num; // auto conversion
        System.out.println("Autoboxing Example:");
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer object: " + obj);

        //Unboxing: converting wrapper object -> primitive
        Integer numberObj = 25;
        int primitiveNum = numberObj; // auto conversion
        System.out.println("\nUnboxing Example:");
        System.out.println("Wrapper Integer: " + numberObj);
        System.out.println("Primitive int: " + primitiveNum);

        // Using wrapper class methods
        System.out.println("\nWrapper Class Methods:");
        System.out.println("Binary of 10: " + Integer.toBinaryString(num));
        System.out.println("Max Value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Value of Integer: " + Integer.MIN_VALUE);

        // Parsing strings to numbers
        String str = "123";
        int parsed = Integer.parseInt(str);
        System.out.println("\nString to int using parseInt(): " + parsed);
    }
}
