// Last updated: 9/11/2026, 9:42:49 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public boolean isValid(String code) {
6        Deque<String> stack = new ArrayDeque<>();
7        int i = 0;
8        int n = code.length();
9
10        while (i < n) {
11            if (i > 0 && stack.isEmpty()) {
12                return false;
13            }
14
15            if (code.startsWith("<![CDATA[", i)) {
16                if (stack.isEmpty()) return false;
17
18                int cdataEnd = code.indexOf("]]>", i + 9);
19                if (cdataEnd == -1) return false;
20
21                i = cdataEnd + 3;
22            } 
23            else if (code.startsWith("</", i)) {
24                int closeTagEnd = code.indexOf('>', i + 2);
25                if (closeTagEnd == -1) return false;
26
27                String tagName = code.substring(i + 2, closeTagEnd);
28                if (stack.isEmpty() || !stack.peek().equals(tagName)) {
29                    return false;
30                }
31
32                stack.pop();
33                i = closeTagEnd + 1;
34            } 
35            else if (code.startsWith("<", i)) {
36                int openTagEnd = code.indexOf('>', i + 1);
37                if (openTagEnd == -1) return false;
38
39                String tagName = code.substring(i + 1, openTagEnd);
40                if (!isValidTagName(tagName)) {
41                    return false;
42                }
43
44                stack.push(tagName);
45                i = openTagEnd + 1;
46            } 
47            else {
48                if (stack.isEmpty()) return false;
49                i++;
50            }
51        }
52
53        return stack.isEmpty();
54    }
55
56    private boolean isValidTagName(String name) {
57        if (name.length() < 1 || name.length() > 9) {
58            return false;
59        }
60        for (int i = 0; i < name.length(); i++) {
61            char ch = name.charAt(i);
62            if (ch < 'A' || ch > 'Z') {
63                return false;
64            }
65        }
66        return true;
67    }
68}