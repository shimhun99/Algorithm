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
    Queue<TreeNode> queue = new ArrayDeque<>();
    int minDepth=0;

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left==0 || right==0) return Math.max(left,right)+1;

        return Math.min(left,right)+1;

        // //dfs
        // if(root == null) return 0;
        // if(root.left==null && root.right==null) return 1;
        // else if(root.left==null) return 1+minDepth(root.right);
        // else if(root.right==null) return 1+minDepth(root.left);
        // else return 1+Math.min(minDepth(root.left), minDepth(root.right));

        // //bfs
        // if(root == null) return 0;

        // queue.add(root);
        // int minDepth = 0;

        // while(!queue.isEmpty()){
        //     minDepth++;
        //     int queueLen = queue.size();

        //     while(queueLen-->0){
        //         TreeNode node = queue.poll();
        //         if(node.left==null && node.right==null) return minDepth;
        //         if(node.left!=null) queue.add(node.left);
        //         if(node.right!=null) queue.add(node.right);
        //     }
        // }  

        // return minDepth;
    }
}