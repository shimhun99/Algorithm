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

class NodeSum {
    TreeNode node;
    int sum;

    NodeSum(TreeNode node, int sum) {
        this.node = node;
        this.sum = sum;
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Queue<NodeSum> queue = new ArrayDeque<>();
        queue.offer(new NodeSum(root, root.val));

        while (!queue.isEmpty()) {
            NodeSum cur = queue.poll();
            TreeNode node = cur.node;
            int sum = cur.sum;

            if (node.left == null && node.right == null && sum == targetSum) {
                return true;
            }

            if (node.left != null) {
                queue.offer(new NodeSum(node.left, sum + node.left.val));
            }

            if (node.right != null) {
                queue.offer(new NodeSum(node.right, sum + node.right.val));
            }
        }

        return false;
    }
}