// Last updated: 9/11/2026, 9:45:56 AM
1import java.util.ArrayList;
2import java.util.Collections;
3import java.util.List;
4
5class Solution {
6    public int[] movesToStamp(String stamp, String target) {
7        char[] s = stamp.toCharArray();
8        char[] t = target.toCharArray();
9        int m = s.length;
10        int n = t.length;
11        
12        List<Integer> result = new ArrayList<>();
13        boolean[] visited = new boolean[n - m + 1];
14        int stars = 0;
15
16        while (stars < n) {
17            boolean replaced = false;
18            
19            for (int i = 0; i <= n - m; i++) {
20                if (!visited[i] && canReplace(t, i, s)) {
21                    stars += replace(t, i, m);
22                    visited[i] = true;
23                    replaced = true;
24                    result.add(i);
25                    if (stars == n) break;
26                }
27            }
28            if (!replaced) return new int[0];
29        }
30        Collections.reverse(result);
31        
32        int[] res = new int[result.size()];
33        for (int i = 0; i < result.size(); i++) {
34            res[i] = result.get(i);
35        }
36        
37        return res;
38    }
39
40    private boolean canReplace(char[] t, int pos, char[] s) {
41        for (int i = 0; i < s.length; i++) {
42            if (t[pos + i] != '?' && t[pos + i] != s[i]) {
43                return false;
44            }
45        }
46        return true;
47    }
48
49    private int replace(char[] t, int pos, int len) {
50        int count = 0;
51        for (int i = 0; i < len; i++) {
52            if (t[pos + i] != '?') {
53                t[pos + i] = '?';
54                count++;
55            }
56        }
57        return count;
58    }
59}