public class TypeCasting {
    public static void main(String[] args) {

        //  Implicit Casting (Widening)
        int num = 10;
        double doubleNum = num; // int → double
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        //  Explicit Casting (Narrowing)
        double pi = 3.14159;
        int approxPi = (int) pi; // double → int
        System.out.println("Explicit Casting (double to int): " + approxPi);

        //  More examples
        char ch = 'A';
        int asciiValue = ch; // char → int
        System.out.println("Implicit Casting (char to int): " + asciiValue);

        int number = 100;
        byte smallNum = (byte) number; // int → byte (may cause data loss)
        System.out.println("Explicit Casting (int to byte): " + smallNum);
    } 
}

// Output:  

// Implicit Casting (int to double): 10.0
// Explicit Casting (double to int): 3

// Implicit Casting (char to int): 65
// Explicit Casting (int to byte): 100
