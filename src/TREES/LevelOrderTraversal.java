package TREES;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrder(Tree.Node root){
        Queue<Tree.Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Tree.Node temp = q.poll();
            System.out.println(temp.val);
            if(temp.left != null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
        }
    }
}
