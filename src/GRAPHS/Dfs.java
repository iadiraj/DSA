package GRAPHS;

public class Dfs extends Graph{
    boolean[] a;
    Dfs(int n) {
        super(n);
        a = new boolean[n+1];
    }
    public void dfsTraversal(){
        for(int i = 1; i <= n; i++){
            dfs(i);
        }
    }

    private void dfs(int x) {
        if(a[x] == false){
            System.out.print(x + " ");
            a[x] = true;
        }
        for(int i : arr[x]){
            if(a[i] == false){
                dfs(i);
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
        g.dfsTraversal();
    }
}
