// Last updated: 9/11/2026, 10:08:04 AM
1import java.util.LinkedList;
2import java.util.Queue;
3class Solution {
4    public int findBottomLeftValue(TreeNode root) {
5        Queue<TreeNode> queue = new LinkedList<>();
6        queue.offer(root);
7        
8        TreeNode current = root;
9        while (!queue.isEmpty()) {
10            current = queue.poll();
11            if (current.right != null) {
12                queue.offer(current.right);
13            }
14            if (current.left != null) {
15                queue.offer(current.left);
16            }
17        }
18        return current.val;
19    }
20}