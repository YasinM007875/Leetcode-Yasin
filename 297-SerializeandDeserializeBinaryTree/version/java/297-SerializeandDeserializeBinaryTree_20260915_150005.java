// Last updated: 9/15/2026, 3:00:05 PM
1import java.util.*;
2
3public class Codec {
4
5    public String serialize(TreeNode root) {
6        StringBuilder sb = new StringBuilder();
7
8        build(root, sb);
9
10        return sb.toString();
11    }
12
13    public void build(TreeNode root, StringBuilder sb) {
14
15        if (root == null) {
16            sb.append("#,");
17            return;
18        }
19
20        sb.append(root.val).append(",");
21
22        build(root.left, sb);
23        build(root.right, sb);
24    }
25
26    public TreeNode deserialize(String data) {
27
28        String[] values = data.split(",");
29        Queue<String> queue = new LinkedList<>();
30
31        for (String value : values) {
32            queue.add(value);
33        }
34
35        return create(queue);
36    }
37
38    public TreeNode create(Queue<String> queue) {
39
40        String value = queue.poll();
41
42        if (value.equals("#")) {
43            return null;
44        }
45
46        TreeNode root = new TreeNode(Integer.parseInt(value));
47
48        root.left = create(queue);
49        root.right = create(queue);
50
51        return root;
52    }
53}