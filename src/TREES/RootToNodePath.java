package TREES;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {

    public static List<Integer> rootNodePath(Tree.Node root, Tree.Node target){
        List<Integer> ans = new ArrayList<>();
        check(root, target, ans);
        return ans;
    }
    public static boolean check(Tree.Node root, Tree.Node target, List<Integer> ans){
        if(root == null){
            return false;
        }
        ans.add(root.val);
        if(root.val == target.val){
            return true;
        }
        if(check(root.left, target, ans) || check(root.right, target, ans)){
            return true;
        }
        ans.remove(ans.size() - 1);
        return false;
    }
}
