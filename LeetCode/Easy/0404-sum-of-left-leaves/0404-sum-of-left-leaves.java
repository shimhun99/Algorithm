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
    Queue<TreeNode> queue = new ArrayDeque<>();

    public int sumOfLeftLeaves(TreeNode root) {
        int total = 0; 
        
        // //bfs
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     TreeNode node = queue.poll();
        //     if(node.left!=null){
        //         if(node.left.left==null && node.left.right==null) total+=node.left.val;
        //         else queue.add(node.left);
        //     }
        //     if(node.right!=null) queue.add(node.right);
        // }
        // return total;

        //dfs
        if(root == null) return 0;

        if(root.left!=null){
            if(root.left.left==null && root.left.right==null) total+=root.left.val;
        }

        return total + sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        // if(root.right!=null) sumOfLeftLeaves(root.right);
    }
}