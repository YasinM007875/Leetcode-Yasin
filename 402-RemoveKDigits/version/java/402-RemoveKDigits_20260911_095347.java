// Last updated: 9/11/2026, 9:53:47 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3class Solution {
4    public String removeKdigits(String num, int k) {
5        int n = num.length();
6        if (k >= n) return "0";
7        Deque<Character> stack = new ArrayDeque<>();
8        for (char digit : num.toCharArray()) {
9            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
10                stack.pop();
11                k--;
12            }
13            stack.push(digit);
14        }
15        while (k > 0 && !stack.isEmpty()) {
16            stack.pop();
17            k--;
18        }
19        StringBuilder sb = new StringBuilder();
20        while (!stack.isEmpty()) {
21            sb.append(stack.pop());
22        }
23        sb.reverse();
24        while (sb.length() > 0 && sb.charAt(0) == '0') {
25            sb.deleteCharAt(0);
26        }
27
28        return sb.length() == 0 ? "0" : sb.toString();
29    }
30}