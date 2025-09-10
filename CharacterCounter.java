public class CharacterCounter {

    public static void main(String[] args) {
        String sentence = "recursion is replacing the repetition of loops";
        char target = 'r';
        int count = 0;

        System.out.println("Counting occurrences of '" + target + "' with a loop...");

        // --- START OF BLOCK TO REPLACE ---
        count=countCharRecursive(sentence,target,0);
        // --- END OF BLOCK TO REPLACE ---

        System.out.println("The character '" + target + "' appears " + count + " times.");
    }

    // TODO: Create a public static int countCharRecursive(String text, char target, int index) function here.
    public static int countCharRecursive(String text, char target, int index)
    {
        if(index==text.length()-1) return 0;
        if (text.charAt(index) == target) {
           return 1+countCharRecursive(text,target,index+1);
        }
        return countCharRecursive(text,target,index+1);
    }
}