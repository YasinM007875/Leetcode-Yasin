// Last updated: 9/15/2026, 10:14:16 AM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> ans = new ArrayList<>();
4
5        if (s.length() < p.length())
6            return ans;
7
8        int[] count = new int[26];
9
10        for (char c : p.toCharArray()) {
11            count[c - 'a']++;
12        }
13
14        int left = 0;
15
16        for (int right = 0; right < s.length(); right++) {
17            count[s.charAt(right) - 'a']--;
18
19            if (right - left + 1 > p.length()) {
20                count[s.charAt(left) - 'a']++;
21                left++;
22            }
23
24            if (right - left + 1 == p.length()) {
25                boolean same = true;
26
27                for (int i = 0; i < 26; i++) {
28                    if (count[i] != 0) {
29                        same = false;
30                        break;
31                    }
32                }
33
34                if (same)
35                    ans.add(left);
36            }
37        }
38
39        return ans;
40    }
41}