public class FibonacciGenerator {

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Generating the first " + count + " Fibonacci numbers iteratively...");

        // --- START OF BLOCK TO REPLACE ---
        // This entire block calculates and prints the sequence.
        // Your goal is to call a recursive function inside a simple loop instead.
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        // --- END OF BLOCK TO REPLACE ---
        System.out.println();
    }

    // TODO: Create a public static int fibonacciRecursive(int n) function here.
    // The main method will then be changed to:

    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}