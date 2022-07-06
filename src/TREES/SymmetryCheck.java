package TREES;

public class SymmetryCheck {
    public static boolean isSymmetric(Tree.Node root){
        if(root == null){
            return true;
        }
        return check(root.left, root.right);
    }
    public static boolean check(Tree.Node left, Tree.Node right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
