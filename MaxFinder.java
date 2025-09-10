public class MaxFinder {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 99, 34};
        int max = Integer.MIN_VALUE;

        System.out.println("Finding the maximum number with a loop...");

        // --- START OF BLOCK TO REPLACE ---
        max=findMaxRecursive(numbers,0);
        // --- END OF BLOCK TO REPLACE ---

        System.out.println("The maximum number is: " + max);

    }

    // TODO: Create a public static int findMaxRecursive(int[] nums, int index) function here.
    public static int findMaxRecursive(int[] nums, int index)
    {
        if(index==nums.length-1) return nums[index];

        int maxNumber= findMaxRecursive(nums,index+1);
        if(maxNumber < nums[index])
        {
            maxNumber=nums[index];
        }
        return maxNumber;
    }
}