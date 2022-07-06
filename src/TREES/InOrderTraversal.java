package TREES;

public class InOrderTraversal {
    public static void inOrder(Tree.Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
}
