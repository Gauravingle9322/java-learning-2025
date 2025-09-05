import java.util.Arrays;

class ArrayUtilities {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Search element
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Element 3 found at index: " + index);
    }
}
