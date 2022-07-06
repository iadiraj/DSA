package TREES;

public class IdenticalTree {
    public static boolean isIdentical(Tree.Node root, Tree.Node clone){
        if(root == null || clone == null){
            return root == clone;
        }
        return root.val == clone.val && isIdentical(root.left, clone.left) && isIdentical(root.right, clone.right);
    }
}
