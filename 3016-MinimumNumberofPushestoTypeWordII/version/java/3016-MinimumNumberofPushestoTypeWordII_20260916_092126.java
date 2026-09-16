// Last updated: 9/16/2026, 9:21:26 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4
5        for (int i = 0; i < word.length(); i++) {
6            freq[word.charAt(i) - 'a']++;
7        }
8
9        int ans = 0;
10
11        for (int k = 0; k < 26; k++) {
12            int max = 0;
13            int index = -1;
14
15            for (int i = 0; i < 26; i++) {
16                if (freq[i] > max) {
17                    max = freq[i];
18                    index = i;
19                }
20            }
21
22            if (max == 0)
23                break;
24
25            int pushes = k / 8 + 1;
26            ans += max * pushes;
27            freq[index] = 0;
28        }
29
30        return ans;
31    }
32}