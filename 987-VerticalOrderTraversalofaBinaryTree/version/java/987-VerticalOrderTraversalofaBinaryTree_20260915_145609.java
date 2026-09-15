// Last updated: 9/15/2026, 2:56:09 PM
1import java.util.*;
2
3class Solution {
4
5    List<int[]> list = new ArrayList<>();
6
7    public List<List<Integer>> verticalTraversal(TreeNode root) {
8
9        dfs(root, 0, 0);
10
11        Collections.sort(list, (a, b) -> {
12
13            // First: column
14            if (a[0] != b[0])
15                return a[0] - b[0];
16
17            // Second: row
18            if (a[1] != b[1])
19                return a[1] - b[1];
20
21            // Third: value
22            return a[2] - b[2];
23        });
24
25        List<List<Integer>> result = new ArrayList<>();
26
27        int prevColumn = Integer.MIN_VALUE;
28
29        for (int[] node : list) {
30
31            int column = node[0];
32            int value = node[2];
33
34            if (column != prevColumn) {
35                result.add(new ArrayList<>());
36                prevColumn = column;
37            }
38
39            result.get(result.size() - 1).add(value);
40        }
41
42        return result;
43    }
44
45    public void dfs(TreeNode root, int row, int column) {
46
47        if (root == null)
48            return;
49
50        list.add(new int[]{column, row, root.val});
51
52        dfs(root.left, row + 1, column - 1);
53        dfs(root.right, row + 1, column + 1);
54    }
55}