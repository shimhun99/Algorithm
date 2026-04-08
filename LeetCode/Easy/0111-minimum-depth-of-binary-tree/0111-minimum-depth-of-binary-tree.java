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

    public int minDepth(TreeNode root) {
        // //dfs
        // if(root == null) return 0;
        // int left = minDepth(root.left);
        // int right = minDepth(root.right);

        // //한쪽 자식이 0이면 null이므로 값이 없다는 소리이므로 반대편 리프노드 값으로 계산
        // if(left==0 || right==0) return Math.max(left,right)+1;
        
        // //왼쪽, 오른쪽 자식 모두 값이 있다면, 최솟값으로 계산
        // return Math.min(left,right)+1;

        //bfs
        if(root == null) return 0;

        queue.add(root);
        int minDepth = 0;

        while(!queue.isEmpty()){
            int queueLen = queue.size();
            minDepth++;

            while(queueLen-->0){
                TreeNode node = queue.poll();
                if(node.left==null && node.right==null) return minDepth;
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }   
        }  

        return minDepth;
    }
}