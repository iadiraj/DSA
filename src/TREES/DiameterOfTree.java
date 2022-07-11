package TREES;

public class DiameterOfTree {
    public static int maxD = 0;
    public int findMaxDiameter(Tree.Node root){
        maxDiameter(root);
        return maxD;
    }
    public static int maxDiameter(Tree.Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = maxDiameter(root.left);
        int rightHeight = maxDiameter(root.right);
        maxD = Math.max(maxD, leftHeight+rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
