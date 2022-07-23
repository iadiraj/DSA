package GRAPHS;

import java.util.Stack;

public class Dfs extends Graph{
    boolean[] a;
    Dfs(int n) {
        super(n);
        a = new boolean[n+1];
    }
    public void dfsRecurTraversal(){
        for(int i = 1; i <= n; i++){
            if(a[i] == false){
                dfsRecur(i);
            }
        }
    }
    public void dfsItTraversal(){
        for(int i = 1; i <= n; i++){
            if(a[i] == false){
                dfsIt(i);
            }
        }
    }
    private void dfsIt(int x){
        Stack<Integer> s = new Stack<>();
        s.push(x);
        while(!s.isEmpty()){
            int i = s.pop();
            a[i] = true;
            System.out.print(i + " ");
            for(int j : arr[x]){
                if(a[j] == false){
                    s.push(j);
                    a[j] = true;
                }
            }
        }
    }
    private void dfsRecur(int x) {
//        if(a[x] == false){
            System.out.print(x + " ");
            a[x] = true;
//        }
        for(int i : arr[x]){
            if(a[i] == false){
                dfsRecur(i);
            }
        }
    }

    public static void main(String[] args) {
        Dfs g = new Dfs(7);
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
        g.dfsRecurTraversal();
    }
}
