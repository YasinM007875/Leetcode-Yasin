// Last updated: 9/16/2026, 9:22:54 AM
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4
5        for (int i = 2; i <= n; i++) {
6            String temp = "";
7
8            for (int j = 0; j < s.length(); j++) {
9                int count = 1;
10
11                while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
12                    count++;
13                    j++;
14                }
15
16                temp += count;
17                temp += s.charAt(j);
18            }
19
20            s = temp;
21        }
22
23        return s;
24    }
25}