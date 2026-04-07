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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode leftNode, TreeNode rightNode){
        //둘다 null인 경우(더이상 탐색할 노드가 없으므로 리턴)
        if(leftNode==null && rightNode==null) return true;

        //한쪽만 null인 경우(더이상 탐색할 노드가 없으므로 리턴)
        if(leftNode==null || rightNode==null) return false;

        //왼쪽, 오른쪽 노드가 같아도 탐색할 자식 노드가 있으면 끝나면 안됨

        if(leftNode.val !=rightNode.val){ //왼쪽, 오른쪽 노드 다른 경우
            return false;   
        }else{ //왼쪽, 오른쪽 노드 같은 경우
            return isMirror(leftNode.left,rightNode.right) && isMirror(leftNode.right,rightNode.left);
        }
        // return leftNode.val == rightNode.val && isMirror(leftNode.left, rightNode.right) && isMirror(leftNode.right, rightNode.left);


        
    } 
}