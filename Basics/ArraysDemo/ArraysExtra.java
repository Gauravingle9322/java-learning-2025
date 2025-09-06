public class ArraysExtra {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 2, 10, 3 };

        // 1. Find Maximum & Minimum
        int max = numbers[0], min = numbers[0];
        for (int num : numbers) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // 2. Sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // 3. Reverse an array
        System.out.print("Reversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 4. Linear Search
        int key = 10;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(key + " not found in array.");
        }

        // 5. Sorting (Ascending)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Matrix Addition
        int[][] a = { { 1, 2 }, { 3, 4 } };
        int[][] b = { { 5, 6 }, { 7, 8 } };
        int[][] c = new int[2][2];

        System.out.println("Matrix Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
