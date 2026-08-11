// Last updated: 8/11/2026, 2:13:55 PM
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
    private int dominantCount=0;
    public int countDominantNodes(TreeNode root) {
        dominantCount = 0;
        findMaxAndCount(root);
        return dominantCount;
    }
    private int findMaxAndCount(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int leftMax=findMaxAndCount(node.left);
        int rightMax=findMaxAndCount(node.right);
        int currentSubtreeMax=Math.max(node.val,Math.max(leftMax,rightMax));
        if(node.val==currentSubtreeMax){
            dominantCount++;
        }
        return currentSubtreeMax;
    }
}