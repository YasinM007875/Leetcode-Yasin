// Last updated: 9/11/2026, 9:56:46 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public boolean find132pattern(int[] nums) {
6        int n = nums.length;
7        if (n < 3) return false;
8
9        Deque<Integer> stack = new ArrayDeque<>();
10        int third = Integer.MIN_VALUE; 
11        for (int i = n - 1; i >= 0; i--) {
12            if (nums[i] < third) {
13                return true;
14            }
15            while (!stack.isEmpty() && stack.peek() < nums[i]) {
16                third = stack.pop();
17            }
18
19            stack.push(nums[i]);
20        }
21
22        return false;
23    }
24}