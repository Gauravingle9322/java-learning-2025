public class StringDemo {
    public static void main(String[] args) {
        //  Creating Strings
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        //  Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        //  Length of string
        System.out.println("Length of combined string: " + combined.length());

        //  Character at specific index
        System.out.println("Character at index 1: " + combined.charAt(1));

        //  Substring
        System.out.println("Substring (0, 5): " + combined.substring(0, 5));

        //  Equals & EqualsIgnoreCase
        String name1 = "Java";
        String name2 = "java";
        System.out.println("Equals: " + name1.equals(name2)); // false
        System.out.println("EqualsIgnoreCase: " + name1.equalsIgnoreCase(name2)); // true

        //  Contains
        System.out.println("Contains 'Hello': " + combined.contains("Hello"));

        //  Replace
        String replaced = combined.replace("World", "Java");
        System.out.println("Replaced String: " + replaced);

        //  ToUpperCase & ToLowerCase
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());

        //  Trim (removes spaces)
        String spaced = "   Hello Java   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");
    }
}

// Output:

// String 1:Hello String 2:World
// Concatenated String:
// Hello World
// Length of
// combined string:11
// Character at index 1:

// e
// Substring (0, 5): Hello
// Equals: false
// EqualsIgnoreCase: true
// Contains 'Hello': true
// Replaced String: Hello Java
// Uppercase: HELLO WORLD
// Lowercase: hello world
// Before trim: '   Hello Java   '
// After trim: 'Hello Java'