// Last updated: 9/14/2026, 8:51:54 PM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3
4        Arrays.sort(nums);
5
6        int n = nums.length;
7
8        int[] dp = new int[n];
9        int[] prev = new int[n];
10
11        Arrays.fill(dp, 1);
12        Arrays.fill(prev, -1);
13
14        int max = 1;
15        int last = 0;
16
17        for (int i = 0; i < n; i++) {
18
19            for (int j = 0; j < i; j++) {
20
21                if (nums[i] % nums[j] == 0 &&
22                    dp[j] + 1 > dp[i]) {
23
24                    dp[i] = dp[j] + 1;
25                    prev[i] = j;
26                }
27            }
28
29            if (dp[i] > max) {
30                max = dp[i];
31                last = i;
32            }
33        }
34
35        List<Integer> result = new ArrayList<>();
36
37        while (last != -1) {
38            result.add(nums[last]);
39            last = prev[last];
40        }
41
42        Collections.reverse(result);
43
44        return result;
45    }
46}