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
import java.util.*;

class Solution {
    public int maxDepth(TreeNode root) {
        //dfs
        if(root == null){
            return 0;
        }

        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
        // //bfs
        // if(root == null) return 0;

        // Queue<TreeNode> queue = new ArrayDeque<>();
        // queue.add(root);
        // int maxDepth=0;

        // while(!queue.isEmpty()){
        //     maxDepth++;
        //     int queueLen = queue.size();

        //     while(queueLen-->0){
        //         TreeNode node = queue.poll();

        //         if(node.left != null) queue.add(node.left);
        //         if(node.right != null) queue.add(node.right);
        //     }
        // }

        // return maxDepth;
    }
}