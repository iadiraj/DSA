package TREES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    Node root;
    int size;
    Scanner sc = new Scanner(System.in);
     static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public void contructTree(){
        Queue<Node> q = new LinkedList<>();
        System.out.print("Enter the Root Element : ");
        int val = sc.nextInt();
        if(val <= -1){
            return;
        }
        root = new Node(val);
        q.offer(root);
        size++;
        while(!q.isEmpty()){
            Node t = q.peek();
            System.out.print("Enter the Left Element : ");
            val = sc.nextInt();
            if(val > -1){
                Node c = new Node(val);
                t.left = c;
                q.offer(c);
                size++;
            }else{
                t.left = null;
            }
            System.out.print("Enter the Right Element : ");
            val = sc.nextInt();
            if(val > -1){
                Node c = new Node(val);
                t.right = c;
                q.offer(c);
                size++;
            }else{
                t.right = null;
            }
            q.poll();
        }
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
