package TREES;

public class LCAal {
    public static Tree.Node LCA(Tree.Node root, Tree.Node p, Tree.Node q){
        Tree.Node[] ans = new Tree.Node[1];
        find(root, p, q, ans);
        return ans[0];
    }
    public static boolean find(Tree.Node root, Tree.Node p, Tree.Node q, Tree.Node[] ans){
        if(root == null){
            return false;
        }
        if(root == p || root == q){
            ans[0] = root;
            return true;
        }
        boolean l = find(root.left, p, q, ans);
        boolean r = find(root.right, p, q, ans);
        if(l && r){
            ans[0] = root;
            return true;
        }
        return l || r;
    }
}
