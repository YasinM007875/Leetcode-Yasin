// Last updated: 9/11/2026, 10:17:12 AM
1
2class Solution {
3    private int maxSum = Integer.MIN_VALUE;
4
5    public int maxPathSum(TreeNode root) {
6        maxGain(root);
7        return maxSum;
8    }
9    private int maxGain(TreeNode node) {
10        if (node == null) {
11            return 0;
12        }
13        int leftGain = Math.max(0, maxGain(node.left));
14        int rightGain = Math.max(0, maxGain(node.right));
15        int currentPathSum = node.val + leftGain + rightGain;
16        maxSum = Math.max(maxSum, currentPathSum);
17        return node.val + Math.max(leftGain, rightGain);
18    }
19}