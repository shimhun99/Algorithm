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
    
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        // //bfs
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     TreeNode node = queue.poll();
        //     TreeNode left = node.left;
        //     TreeNode right = node.right;

        //     node.left=right;
        //     node.right=left;

        //     if(left!=null) queue.add(left);
        //     if(right!=null) queue.add(right);
        // }
        // return root;

        // dfs
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}