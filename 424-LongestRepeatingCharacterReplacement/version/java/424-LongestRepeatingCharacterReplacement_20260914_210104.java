// Last updated: 9/14/2026, 9:01:04 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3
4        int[] count = new int[26];
5
6        int left = 0;
7        int maxFreq = 0;
8        int answer = 0;
9
10        for (int right = 0; right < s.length(); right++) {
11
12            count[s.charAt(right) - 'A']++;
13
14            maxFreq = Math.max(maxFreq,
15                    count[s.charAt(right) - 'A']);
16
17            int windowSize = right - left + 1;
18
19            if (windowSize - maxFreq > k) {
20                count[s.charAt(left) - 'A']--;
21                left++;
22            }
23
24            answer = Math.max(answer, right - left + 1);
25        }
26
27        return answer;
28    }
29}