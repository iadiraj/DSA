package TREES;

public class MaxPathSum {
    public static int maxS = Integer.MIN_VALUE;
    public static int maxSum(Tree.Node root){
        if(root == null){
            return 0;
        }
        int leftSum = Math.max(maxSum(root.left), 0);
        int rightSum = Math.max(maxSum(root.right), 0);
        maxS = Math.max(maxS, leftSum + rightSum + root.val);
        return root.val + Math.max(leftSum, rightSum);
    }
}
