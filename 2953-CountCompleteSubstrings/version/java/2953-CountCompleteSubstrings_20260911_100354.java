// Last updated: 9/11/2026, 10:03:54 AM
1class Solution {
2    public int countCompleteSubstrings(String word, int k) {
3        int n = word.length();
4        int totalCompleteSubstrings = 0;
5        int start = 0;
6        for (int i = 0; i < n; i++) {
7            if (i == n - 1 || Math.abs(word.charAt(i) - word.charAt(i + 1)) > 2) {
8                totalCompleteSubstrings += countForBlock(word, start, i, k);
9                start = i + 1;
10            }
11        }
12
13        return totalCompleteSubstrings;
14    }
15    private int countForBlock(String word, int left, int right, int k) {
16        int count = 0;
17        int blockLen = right - left + 1;
18        for (int m = 1; m <= 26; m++) {
19            int windowSize = m * k;
20            if (windowSize > blockLen) {
21                break;
22            }
23
24            int[] freq = new int[26];
25            int charactersWithFreqK = 0;
26            for (int i = left; i < left + windowSize; i++) {
27                int charIdx = word.charAt(i) - 'a';
28                freq[charIdx]++;
29            }
30            for (int val : freq) {
31                if (val == k) {
32                    charactersWithFreqK++;
33                }
34            }
35
36            if (charactersWithFreqK == m) {
37                count++;
38            }
39
40            for (int i = left + windowSize; i <= right; i++) {
41                int inIdx = word.charAt(i) - 'a';
42                if (freq[inIdx] == k) {
43                    charactersWithFreqK--;
44                }
45                freq[inIdx]++;
46                if (freq[inIdx] == k) {
47                    charactersWithFreqK++;
48                }
49
50                int outIdx = word.charAt(i - windowSize) - 'a';
51                if (freq[outIdx] == k) {
52                    charactersWithFreqK--;
53                }
54                freq[outIdx]--;
55                if (freq[outIdx] == k) {
56                    charactersWithFreqK++;
57                }
58
59                if (charactersWithFreqK == m) {
60                    count++;
61                }
62            }
63        }
64
65        return count;
66    }
67}