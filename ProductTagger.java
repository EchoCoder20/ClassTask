

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ProductTagger {
    /**
     * TO-DO: Check if 'setA' is a subset of 'setB'.
     * For example, if setA is {"electronics", "sale"} and setB is {"electronics", "sale", "new"},
     * then the method should return true.
     \*
     * @param setA The potential subset.
     * @param setB The potential superset.
     * @return true if all elements of setA are in setB, false otherwise.
     */
    public boolean isSubset(Set<String> setA, Set<String> setB) {
        // Your code here. Find the correct method in the Set interface.
        if(setB.containsAll(setA)) return true;
        return false; // Placeholder
    }

}
