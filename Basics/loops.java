class Loops {
    public static void main(String[] args) {

        // For Loop Example
        System.out.println("---- For Loop ----");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // While Loop Example
        System.out.println("\n---- While Loop ----");
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // Do-While Loop Example
        System.out.println("\n---- Do-While Loop ----");
        int k = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k <= 5);

        // Nested For Loop
    System.out.println("Nested For Loop (Multiplication Table of 1 to 3):");
    for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 5; col++) {
        System.out.print(row * col + "\t");
    }
    System.out.println();
    }
  }
}