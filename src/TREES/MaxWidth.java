package TREES;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxWidth {
    static class Pair{
        Tree.Node t;
        long n;
        Pair(Tree.Node t, long n){
            this.t = t;
            this.n = n;
        }
    }
    public static long findWidth(Tree.Node root){
        Deque<Pair> d = new ArrayDeque<>();
        d.offer(new Pair(root, 0));
        long ans = 0;
        while(!d.isEmpty()){
            int size = d.size();
            ans = Math.max(ans ,d.getLast().n - d.getFirst().n);
            for(int i = 0; i < size; i++){
                Tree.Node temp = d.getFirst().t;
                long n = d.getFirst().n;
                d.poll();
                if(temp.left != null){
                    d.offer(new Pair(temp.left, n*2+1));
                }
                if(temp.right != null){
                    d.offer(new Pair(temp.right, n*2+2));
                }
            }
        }
        return ans;
    }

}
