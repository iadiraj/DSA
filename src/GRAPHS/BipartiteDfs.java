package GRAPHS;

import java.util.Stack;

public class BipartiteDfs extends Graph{
    int[] isColored;

    BipartiteDfs(int n) {
        super(n);
        isColored = new int[n+1];
        for(int i = 0; i <= n; i++){
            isColored[i] = -1;
        }
    }
    public boolean dfsBipartiteDetect(){
        for(int i = 0; i <= n; i++){
            if(isColored[i] == -1){
                if(dfsBipartite(i) == false){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfsBipartite(int x) {
        Stack<Integer> s = new Stack();
        s.push(x);
        isColored[x] = 1;
        while(!s.isEmpty()){
            int t = s.pop();
            for(int i : arr[x]){
                if(isColored[i] == -1){
                    isColored[i] = 1 - isColored[t];
                }
                else if(isColored[i] == isColored[t]){
                    return false;
                }
            }
        }
        return true;
    }
}
