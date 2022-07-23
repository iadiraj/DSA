package GRAPHS;

import java.util.Stack;

public class CycleDetectDfs extends Graph{
    boolean[] a;
    int[] parent;
    CycleDetectDfs(int n) {
        super(n);
        a = new boolean[n+1];
        parent = new int[n+1];
    }
    public boolean dfsCycleDetect(){
        for(int i = 1; i <= n; i++){
            if(a[i] == false){
                if(isCycle(i) == true){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCycle(int x) {
        Stack<Integer> s = new Stack<>();
        s.push(x);
        a[x] = true;
        parent[x] = -1;
        while(!s.isEmpty()){
            int i = s.pop();
            for(int j : arr[i]){
                if(a[j] == false){
                    a[j] = true;
                    parent[j] = i;
                }else if(parent[j] != i){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetectDfs g = new CycleDetectDfs(7);
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
        System.out.println(g.dfsCycleDetect());
    }
}
