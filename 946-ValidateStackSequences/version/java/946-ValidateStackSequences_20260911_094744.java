// Last updated: 9/11/2026, 9:47:44 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public boolean validateStackSequences(int[] pushed, int[] popped) {
6        Deque<Integer> stack = new ArrayDeque<>();
7        int popIndex = 0;
8
9        for (int val : pushed) {
10            stack.push(val); 
11            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
12                stack.pop();
13                popIndex++;
14            }
15        }
16
17        return stack.isEmpty();
18    }
19}