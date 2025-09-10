import java.util.Arrays;
import java.util.List;

public class ListSummer {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int totalSum = 0;

        System.out.println("Calculating sum using a loop...");

        // --- START OF BLOCK TO REPLACE ---
        for (int i = 0; i < numbers.size(); i++) {
            totalSum += numbers.get(i);
            System.out.println("Current sum: " + totalSum);
        }
        // --- END OF BLOCK TO REPLACE ---

        System.out.println("--------------------------");
        System.out.println("The final sum is: " + totalSum);

        //--- Answer From calculateSumRecursive Function ---
        System.out.println("The final sum is :" + calculateSumRecursive(numbers,-1));
    }
    // TODO: Create a public static int calculateSumRecursive(List<Integer> nums, int index) function here.

    public static int calculateSumRecursive(List<Integer> nums, int index)
    {
        if(index==nums.size()-1) return 0;
        index++;
        return nums.get(index) +calculateSumRecursive(nums,index);
    }

}