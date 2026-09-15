// Last updated: 9/15/2026, 2:51:51 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3
4        if (s1.length() > s2.length())
5            return false;
6
7        int[] a = new int[26];
8        int[] b = new int[26];
9
10        for (int i = 0; i < s1.length(); i++) {
11            a[s1.charAt(i) - 'a']++;
12            b[s2.charAt(i) - 'a']++;
13        }
14
15        for (int i = s1.length(); i < s2.length(); i++) {
16
17            if (same(a, b))
18                return true;
19
20            b[s2.charAt(i) - 'a']++;
21            b[s2.charAt(i - s1.length()) - 'a']--;
22        }
23
24        return same(a, b);
25    }
26
27    public boolean same(int[] a, int[] b) {
28
29        for (int i = 0; i < 26; i++) {
30            if (a[i] != b[i])
31                return false;
32        }
33
34        return true;
35    }
36}