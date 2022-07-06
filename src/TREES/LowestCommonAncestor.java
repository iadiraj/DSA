package TREES;

public class LowestCommonAncestor {
    public static Tree.Node findLCA(Tree.Node root, Tree.Node first, Tree.Node second){
        if(root == null){
            return null;
        }
        if(root == first || root == second){
            return root;
        }
        Tree.Node l = findLCA(root.left, first, second);
        Tree.Node r = findLCA(root.right, first, second);
        if(l == null){
            return r;
        }else if(r == null){
            return l;
        }else{
            return root;
        }
    }

}
