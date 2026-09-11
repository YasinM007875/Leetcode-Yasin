// Last updated: 9/11/2026, 9:49:26 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public int[] asteroidCollision(int[] asteroids) {
6        Deque<Integer> stack = new ArrayDeque<>();
7
8        for (int ast : asteroids) {
9            boolean exploded = false;
10            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
11                int top = stack.peek();
12                
13                if (top < -ast) {
14                    stack.pop();
15                } else if (top == -ast) {
16                    
17                    stack.pop();
18                    exploded = true;
19                    break;
20                } else {
21                    exploded = true;
22                    break;
23                }
24            }
25            if (!exploded) {
26                stack.push(ast);
27            }
28        }
29
30        int[] result = new int[stack.size()];
31        for (int i = result.length - 1; i >= 0; i--) {
32            result[i] = stack.pop();
33        }
34
35        return result;
36    }
37}