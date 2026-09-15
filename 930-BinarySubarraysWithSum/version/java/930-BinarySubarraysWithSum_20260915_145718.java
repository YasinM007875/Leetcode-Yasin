// Last updated: 9/15/2026, 2:57:18 PM
1import java.util.*;
2
3class Solution {
4    public int numSubarraysWithSum(int[] nums, int goal) {
5        Map<Integer, Integer> map = new HashMap<>();
6
7        map.put(0, 1);
8
9        int sum = 0;
10        int count = 0;
11
12        for (int num : nums) {
13            sum += num;
14
15            if (map.containsKey(sum - goal)) {
16                count += map.get(sum - goal);
17            }
18
19            map.put(sum, map.getOrDefault(sum, 0) + 1);
20        }
21
22        return count;
23    }
24}