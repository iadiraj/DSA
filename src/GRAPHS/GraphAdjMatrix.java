package GRAPHS;

public class GraphAdjMatrix {
    int[][] matrix;
    int n;
    GraphAdjMatrix(int n){
        this.n = n;
        this.matrix = new int[n+1][n+1];
    }
    public void construct(int x, int y){
        matrix[x][y] = 1;
        matrix[y][x] = 1;
    }
    public void print(){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        GraphAdjMatrix g = new GraphAdjMatrix(5);
        g.construct(1, 2);
        g.construct(1, 3);
        g.construct(2, 4);
        g.construct(3, 4);
        g.construct(3, 5);
        g.construct(4, 5);
        g.print();
    }
}
