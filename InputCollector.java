import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCollector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> allergies = new ArrayList<>();

        System.out.println("Enter allergies one by one. Press 'q' to quit.");
        String input = "";

        // --- START OF BLOCK TO REPLACE ---
        allergies=collectInputsRecursive(scanner,allergies);

        // --- END OF BLOCK TO REPLACE ---

        System.out.println("\n--- Collected Allergies ---");
        for (String allergy : allergies) {
            System.out.println("- " + allergy);
        }
        scanner.close();
    }

    // TODO: Create a public static List<String> collectInputsRecursive(Scanner sc, List<String> currentList) function here.
    public static List<String> collectInputsRecursive(Scanner sc, List<String> currentList)
    {
        System.out.print("Enter allergy: ");
        String input= sc.nextLine();
        if(input.equals("q")) return currentList;
        currentList.add(input);
        return collectInputsRecursive(sc,currentList);
    }
}
