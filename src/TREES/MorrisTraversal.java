package TREES;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {
    public static void morrisTraversal(Tree.Node root){
        List<Integer> arr = new ArrayList<>();
        Tree.Node curr = root;
        arr.add(curr.val);
        while(curr != null){
            if(curr.left == null){
                arr.add(curr.val);
                curr = curr.right;
            }else{
                Tree.Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
    }
}
