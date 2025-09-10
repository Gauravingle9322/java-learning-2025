class OneDArray {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Access elements using index
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[numbers.length - 1]);

        // Traverse using for loop
        System.out.println("\nArray Elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Traverse using for-each loop
        System.out.println("\nArray Elements using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
