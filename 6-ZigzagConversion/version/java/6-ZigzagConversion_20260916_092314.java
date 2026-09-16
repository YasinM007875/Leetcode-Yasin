// Last updated: 9/16/2026, 9:23:14 AM
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || numRows >= s.length()) {
4            return s;
5        }
6
7        String[] rows = new String[numRows];
8
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = "";
11        }
12
13        int row = 0;
14        int direction = 1;
15
16        for (int i = 0; i < s.length(); i++) {
17            rows[row] += s.charAt(i);
18
19            if (row == 0) {
20                direction = 1;
21            } else if (row == numRows - 1) {
22                direction = -1;
23            }
24
25            row += direction;
26        }
27
28        String ans = "";
29
30        for (int i = 0; i < numRows; i++) {
31            ans += rows[i];
32        }
33
34        return ans;
35    }
36}