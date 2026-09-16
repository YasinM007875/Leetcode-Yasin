// Last updated: 9/16/2026, 9:26:10 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
4
5        for (int num : nums) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8
9        java.util.ArrayList<Integer>[] bucket = new java.util.ArrayList[nums.length + 1];
10
11        for (int num : map.keySet()) {
12            int freq = map.get(num);
13
14            if (bucket[freq] == null) {
15                bucket[freq] = new java.util.ArrayList<>();
16            }
17
18            bucket[freq].add(num);
19        }
20
21        int[] ans = new int[k];
22        int index = 0;
23
24        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
25            if (bucket[i] != null) {
26                for (int num : bucket[i]) {
27                    ans[index] = num;
28                    index++;
29
30                    if (index == k) {
31                        break;
32                    }
33                }
34            }
35        }
36
37        return ans;
38    }
39}