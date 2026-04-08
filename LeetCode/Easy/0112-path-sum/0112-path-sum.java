/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int targetSum;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.targetSum=targetSum;
        if(root == null) return false;

        return dfs(root, root.val);
    }

    boolean dfs(TreeNode node, int currSum){

        //리프 도착
        if(node.left==null && node.right==null){
            // if(currSum == targetSum) return true;
            return currSum == targetSum;
        }

        if(node.left!=null && dfs(node.left, currSum+node.left.val)) return true;
        if(node.right!=null && dfs(node.right, currSum+node.right.val)) return true;

        return false;
    }
}