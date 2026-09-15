// Last updated: 9/15/2026, 2:54:02 PM
1import java.util.*;
2
3class Solution {
4    public int totalFruit(int[] fruits) {
5
6        Map<Integer, Integer> map = new HashMap<>();
7
8        int left = 0;
9        int max = 0;
10
11        for (int right = 0; right < fruits.length; right++) {
12
13            map.put(fruits[right],
14                    map.getOrDefault(fruits[right], 0) + 1);
15
16            while (map.size() > 2) {
17
18                map.put(fruits[left],
19                        map.get(fruits[left]) - 1);
20
21                if (map.get(fruits[left]) == 0) {
22                    map.remove(fruits[left]);
23                }
24
25                left++;
26            }
27
28            max = Math.max(max, right - left + 1);
29        }
30
31        return max;
32    }
33}