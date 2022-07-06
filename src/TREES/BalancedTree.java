package TREES;

public class BalancedTree {
    public static int isBalanced(Tree.Node root){
        if(root == null){
            return 0;
        }
        int lefHeight = isBalanced(root.left);
        int rightHeight = isBalanced(root.right);
        if(lefHeight == -1 || rightHeight == -1){
            return -1;
        }
        if(Math.abs(lefHeight - rightHeight) > 1){
            return -1;
        }
        return 1 + Math.max(lefHeight, rightHeight);
    }
}
