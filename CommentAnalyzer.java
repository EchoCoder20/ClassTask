import java.util.ArrayList;
import java.util.List;


class Comment {
    private String text;
    private List<Comment> replies = new ArrayList<>();

    public Comment(String text) {
        this.text = text;
    }

    public void addReply(Comment reply) {
        this.replies.add(reply);
    }

    public List<Comment> getReplies() {
        return replies;
    }
}

public class CommentAnalyzer {

    /**
     * Calculates the maximum depth of a comment thread.
     * The depth of a single comment with no replies is 1.
     * The depth of a comment with replies is 1 + the maximum depth of its direct replies.
     \*
     * @param comment The starting comment of the thread.
     * @return The maximum depth of the thread.
     */
    public int calculateThreadDepth(Comment comment) {

        if(comment.getReplies().isEmpty())
        {
           return 1;
        }
            int maximumDepth=0;
            for (Comment reply : comment.getReplies()) {
                int nodeDepth = calculateThreadDepth(reply); // add subordinates
                if(maximumDepth < nodeDepth)
                {
                    maximumDepth=nodeDepth;
                }
            }
            return maximumDepth+1;


        // Your implementation here

    }


    public static void main(String[] args) {
        Comment topLevelComment = new Comment("This is the first comment.");
        Comment reply1 = new Comment("A reply to the first comment.");
        Comment reply2 = new Comment("Another reply.");

        topLevelComment.addReply(reply1);
        topLevelComment.addReply(reply2);

        Comment nestedReply1 = new Comment("A reply to reply1.");
        reply1.addReply(nestedReply1);

        Comment deeplyNested = new Comment("So deep!");
        nestedReply1.addReply(deeplyNested);

        CommentAnalyzer analyzer = new CommentAnalyzer();

        // The thread starting from topLevelComment should have a depth of 4.
        // topLevelComment -> reply1 -> nestedReply1 -> deeplyNested
        int depth = analyzer.calculateThreadDepth(topLevelComment);
        System.out.println("The maximum depth of the thread is: " + depth);

        // The thread starting from reply2 should have a depth of 1.
        int depth2 = analyzer.calculateThreadDepth(reply2);
        System.out.println("The maximum depth of reply2's thread is: " + depth2);
    }
}