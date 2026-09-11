// Last updated: 9/11/2026, 9:51:00 AM
1import java.util.ArrayDeque;
2import java.util.Arrays;
3import java.util.Deque;
4
5class Solution {
6    public int[] nextGreaterElements(int[] nums) {
7        int n = nums.length;
8        int[] result = new int[n];
9        Arrays.fill(result, -1);
10        
11        Deque<Integer> stack = new ArrayDeque<>();
12        
13        for (int i = 0; i < 2 * n; i++) {
14            int num = nums[i % n];
15            
16            while (!stack.isEmpty() && nums[stack.peek()] < num) {
17                result[stack.pop()] = num;
18            }
19            
20            if (i < n) {
21                stack.push(i);
22            }
23        }
24        
25        return result;
26    }
27}