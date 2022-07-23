package GRAPHS;

import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionBfs extends Graph{
    boolean[] a;
    int[] parent;
    CycleDetectionBfs(int n) {
        super(n);
        a = new boolean[n+1];
        parent = new int[n+1];
    }
    public boolean bfsCycleDetect(){
        for(int i = 0; i <= n; i++){
            if(a[i] == false){
                if(isCycle(i) == true){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCycle(int i) {
        Queue<Integer> q = new LinkedList<>();
        a[i] = true;
        parent[i] = -1;
        q.add(i);
        while(!q.isEmpty()){
            int x = q.poll();
            for(int j : arr[x]){
                if(a[j] == false){
                    a[j] = true;
                    parent[j] = x;
                }else if(parent[j] != x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetectionBfs g = new CycleDetectionBfs(7);
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
        System.out.println(g.bfsCycleDetect());
    }
}
