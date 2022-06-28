package BINARYTREE;
// 124. Binary Tree Maximum Path Sum
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaxPathSum {
//    SOLUTION :
    public static int maxPathSum(Tree.Node root){
        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        calculateSum(root, maxSum);
        return maxSum[0];
    }
    public static int calculateSum(Tree.Node root, int[] maxSum){
        if(root == null){
            return 0;
        }
        int leftSum = calculateSum(root.left, maxSum);
        int rightSum = calculateSum(root.right, maxSum);
        maxSum[0] = Math.max(maxSum[0], leftSum + rightSum + root.val);
        return root.val + Math.max(leftSum, rightSum);
    }
}
