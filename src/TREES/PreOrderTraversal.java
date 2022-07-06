package TREES;

public class PreOrderTraversal {
    public static void preOrder(Tree.Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
