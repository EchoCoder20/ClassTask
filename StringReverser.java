public class StringReverser {

    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";

        System.out.println("Reversing string using a loop...");

        // --- START OF BLOCK TO REPLACE ---
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        // --- END OF BLOCK TO REPLACE ---

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        ////////////Recursive Function Call//////////////
        System.out.println("Reversed By Recursive :" + reverseStringRecursive(original));
    }

    // TODO: Create a public static String reverseStringRecursive(String str) function here.
    public static String reverseStringRecursive(String str)
    {
        if(str.isEmpty()|| str.length()==1) return str;
        return str.substring(str.length()-1)+reverseStringRecursive(str.substring(0,str.length()-1));
    }

}