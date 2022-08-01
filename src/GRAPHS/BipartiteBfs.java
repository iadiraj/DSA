package GRAPHS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteBfs extends Graph{
    int[] isColored;
    BipartiteBfs(int n) {
        super(n);
        isColored = new int[n+1];
        for(int i = 0; i < isColored.length; i++){
            isColored[i] = -1;
        }
    }

    public boolean bfsBipartiteDetect(){
        for(int i = 0; i <= n; i++){
            if(isColored[i] == -1){
                if(bfsBipartite(i) == false){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean bfsBipartite(int x){
        Queue<Integer> q = new LinkedList<>();
        isColored[x] = 1;
        q.offer(x);
        while(!q.isEmpty()){
            int t = q.poll();
            for(int i : arr[x]){
                if(isColored[i] == -1){
                    isColored[i] = 1 - isColored[t];
                }else if(isColored[i] == isColored[t]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipartiteBfs g = new BipartiteBfs(7);
        g.construct(1, 2);
        g.construct(1, 3);
        g.construct(1, 4);
        g.construct(2, 3);
        g.construct(2, 4);
        g.construct(2, 5);
        g.construct(3, 4);
        g.construct(4, 5);
        g.construct(6, 7);
        g.print();
        System.out.println(g.bfsBipartiteDetect());

    }
}
