package GRAPHS;

public class Bfs extends Graph{
    boolean[] a;
    Bfs(int n) {
        super(n);
        a = new boolean[n+1];

    }
    public void bfsTraversal(){
        for(int i = 1; i <= n; i++){
            bfs(i);
        }
    }
    private void bfs(int x){
        if(a[x] == false){
            System.out.print(x + " ");
            a[x] = true;
        }
        for(int i : arr[x]){
            if(a[i] == false){
                System.out.print(i + " ");
                a[i] = true;
            }
        }
    }
    public static void main(String[] args) {
        Bfs g = new Bfs(7);
        g.construct(1, 2);
        g.construct(1, 3);
        g.construct(1, 4);
        g.construct(2, 3);
        g.construct(2, 4);
        g.construct(2, 5);
        g.construct(3, 4);
        g.construct(4, 5);
        g.construct(6, 7);
        g.bfsTraversal();
    }
}
