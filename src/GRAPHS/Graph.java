package GRAPHS;

import java.util.ArrayList;

public class Graph {
    int n;
    ArrayList<Integer>[] arr;
    Graph(int n){
        this.n = n;
        arr = new ArrayList[n+1];
        for(int i = 0; i <= n; i++){
            arr[i] = new ArrayList<Integer>();
        }
    }
    public void construct(int i, int x){
        arr[i].add(x);
        arr[x].add(i);
    }
    public void print(){
        for(int i = 0; i <= n; i++){
            System.out.println(i + " " + arr[i]);
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.construct(1, 2);
        g.construct(1, 3);
        g.construct(1, 4);
        g.construct(2, 3);
        g.construct(2, 4);
        g.construct(2, 5);
        g.construct(3, 4);
        g.construct(4, 5);
        g.print();
    }
}
