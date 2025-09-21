
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

class UserManagement {
    private Set<String> approvedUsers = new HashSet<>(Arrays.asList("a@test.com", "b@test.com", "c@test.com"));

    /**
     * TO-DO: Remove all emails from the 'emailsToRemove' list from the 'approvedUsers' set.
     \*
     * @param emailsToRemove A list of email strings to be removed.
     */
    public void removeUsers(List<String> emailsToRemove) {
        // Your code here. Use a single method call for this.
        approvedUsers.removeAll(emailsToRemove);

    }

    public Set<String> getApprovedUsers() {
        return approvedUsers;
    }

}