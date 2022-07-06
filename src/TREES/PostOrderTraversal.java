package TREES;

public class PostOrderTraversal {
    public static void postOrder(Tree.Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }
}
