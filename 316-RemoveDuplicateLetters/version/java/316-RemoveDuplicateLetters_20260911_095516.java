// Last updated: 9/11/2026, 9:55:16 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public String removeDuplicateLetters(String s) {
6        int[] lastIndex = new int[26];
7        boolean[] inStack = new boolean[26];
8        for (int i = 0; i < s.length(); i++) {
9            lastIndex[s.charAt(i) - 'a'] = i;
10        }
11
12        Deque<Character> stack = new ArrayDeque<>();
13
14        for (int i = 0; i < s.length(); i++) {
15            char ch = s.charAt(i);
16            if (inStack[ch - 'a']) continue;
17            while (!stack.isEmpty() && stack.peek() > ch && lastIndex[stack.peek() - 'a'] > i) {
18                char removed = stack.pop();
19                inStack[removed - 'a'] = false;
20            }
21
22            stack.push(ch);
23            inStack[ch - 'a'] = true;
24        }
25        StringBuilder sb = new StringBuilder();
26        while (!stack.isEmpty()) {
27            sb.append(stack.pop());
28        }
29
30        return sb.reverse().toString();
31    }
32}