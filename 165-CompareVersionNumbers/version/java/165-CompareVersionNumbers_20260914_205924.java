// Last updated: 9/14/2026, 8:59:24 PM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3
4        String[] a = version1.split("\\.");
5        String[] b = version2.split("\\.");
6
7        int n = Math.max(a.length, b.length);
8
9        for (int i = 0; i < n; i++) {
10
11            int x = i < a.length ? Integer.parseInt(a[i]) : 0;
12            int y = i < b.length ? Integer.parseInt(b[i]) : 0;
13
14            if (x < y)
15                return -1;
16
17            if (x > y)
18                return 1;
19        }
20
21        return 0;
22    }
23}
24