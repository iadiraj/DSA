package TREES;

public class LongestUnivaluedTree {
    static class Pair {
        int n;
        int x;

        Pair(int n, int x) {
            this.n = n;
            this.x = x;
        }
    }

    public int ans = 1;

    public int longestUnivaluePath(Tree.Node root) {
        findPath(root);
        return ans - 1;
    }

        public Pair findPath(Tree.Node root){
        if(root == null){
            return new Pair(0, 0);
        }
        Pair a = findPath(root.left);
        Pair b = findPath(root.right);
        Pair c = null;
        if(a.n == root.val && b.n == root.val){
            ans = Math.max(ans, a.x + b.x + 1);
            c = new Pair(root.val, Math.max(a.x, b.x)+1);
        }else if(a.n != root.val && b.n != root.val){
            c = new Pair(root.val, 1);
        }else if(a.n != root.val){
            ans = Math.max(ans, b.x + 1);
            c = new Pair(root.val, b.x + 1);
        }else if(b.n != root.val){
            ans = Math.max(ans, a.x + 1);
            c = new Pair(root.val, a.x + 1);
        }
        return c;
    }
}
