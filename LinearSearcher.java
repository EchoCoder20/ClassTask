import java.util.Arrays;
import java.util.List;

public class LinearSearcher {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Mango");
        String targetFruit = "Grape";
        boolean found = false;

        System.out.println("Searching for '" + targetFruit + "' with a loop...");

        // --- START OF BLOCK TO REPLACE ---

        found=searchRecursive(fruits,targetFruit,0);
        // --- END OF BLOCK TO REPLACE ---

        if (found) {
            System.out.println("Success! Found the fruit.");
        } else {
            System.out.println("Failure! Fruit not in the list.");
        }
    }

    // TODO: Create a public static boolean searchRecursive(List<String> items, String target, int index) function here.
    public static boolean searchRecursive(List<String> items, String target, int index)
    {
        if(index==items.size()-1) return false;
        if(items.get(index).equals(target)) return true;
        return searchRecursive(items,target,index+1);
    }
}