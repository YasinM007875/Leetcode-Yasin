// Last updated: 9/14/2026, 8:56:27 PM
1class Solution {
2
3    int cameras = 0;
4
5    public int minCameraCover(TreeNode root) {
6
7        if (check(root) == 2)
8            cameras++;
9
10        return cameras;
11    }
12
13    int check(TreeNode node) {
14
15        if (node == null)
16            return 1;
17
18        int left = check(node.left);
19        int right = check(node.right);
20
21        
22        if (left == 2 || right == 2) {
23            cameras++;
24            return 0;
25        }
26
27        
28        if (left == 0 || right == 0)
29            return 1;
30
31        
32        return 2;
33    }
34}