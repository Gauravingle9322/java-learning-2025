public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {

        // Autoboxing: Converting primitive to Wrapper
        int a = 10;
        Integer obj = a; // compiler automatically converts int → Integer
        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + obj);

        //  Unboxing: Converting Wrapper to primitive
        Integer num = 25;
        int b = num; // compiler automatically converts Integer → int
        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Integer: " + num);
        System.out.println("Primitive int: " + b);

        // Autoboxing with other types
        double d = 12.5;
        Double dObj = d; // Autoboxing
        double d2 = dObj; // Unboxing
        System.out.println("\nAutoboxing & Unboxing with double:");
        System.out.println("Primitive double: " + d);
        System.out.println("Wrapper Double: " + dObj);
        System.out.println("Unboxed double: " + d2);

        // In collections (autoboxing/unboxing in background)
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(100); // autoboxing → int to Integer
        list.add(200);
        list.add(300);

        System.out.println("\nAutoboxing in Collections:");
        for (int val : list) { // unboxing → Integer to int
            System.out.println(val);
        }
    }
}
