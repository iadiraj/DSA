package TREES;

public class MaximumDepth {
    public static int maxDepth(Tree.Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
