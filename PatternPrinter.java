public class PatternPrinter {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println("Printing a descending star pattern with nested loops...");

        // --- START OF BLOCK TO REPLACE ---
        printPatternRecursive(numRows, numRows);
        // --- END OF BLOCK TO REPLACE ---
    }

    // TODO: Create a public static void printPatternRecursive(int rows, int cols) function here.
    // Hint: Your initial call from main should be printPatternRecursive(numRows, numRows);
    public static void printPatternRecursive(int rows, int cols)
    {
        if(rows==0) return;
        if(cols==0)
        {
            System.out.println();
            printPatternRecursive(rows-1,rows-1);
        }
        else
        {
            System.out.print("* ");
            printPatternRecursive(rows,cols-1);
        }


    }
}