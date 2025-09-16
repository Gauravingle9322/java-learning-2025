// OperatorsDemo.java
// Demonstrates different types of operators in Java

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 20;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("b / a = " + (b / a)); // division
        System.out.println("b % a = " + (b % a)); // modulus

        // 2. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y)); // AND
        System.out.println("x || y : " + (x || y)); // OR
        System.out.println("!x     : " + (!x)); // NOT

        // 4. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 5;
        System.out.println("c = " + c);
        c += 3; // c = c + 3
        System.out.println("c += 3 : " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2 : " + c);
        c *= 4; // c = c * 4
        System.out.println("c *= 4 : " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2 : " + c);

        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int d = 7;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // pre-increment
        System.out.println("d++ = " + (d++)); // post-increment
        System.out.println("After d++ : " + d);
        System.out.println("--d = " + (--d)); // pre-decrement
        System.out.println("d-- = " + (d--)); // post-decrement
        System.out.println("After d-- : " + d);

        // 6. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);
    }
}


/*
 * === Arithmetic Operators ===
 * 
 * a+b=30
 * a-b=-10
 * a*b=200
 * b/a=2
 * b%a=0
 * 
 * ===Relational Operators===
 * 
 * a==b:false
 * a!=b:true
 * a>b:false
 * a<b:true
 * a>=b:false
 * a<=b:true
 * 
 * ===Logical Operators===
 * 
 * x&&y:false
 * x||y:true
 * !x:false
 * 
 * ===Assignment Operators===
 * c=5
 * c+=3:8
 * c-=2:6
 * c*=4:24
 * c/=2:12
 * 
 * ===Unary Operators===
 * d=7
 * ++d=8
 * d++=8
 * After d++:9
 * --d=8
 * d--=8
 * After d--:7
 * 
 * ===Ternary Operator===
 * Max of a and b = 20
 */