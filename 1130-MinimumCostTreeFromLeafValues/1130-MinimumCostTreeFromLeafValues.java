// Last updated: 9/11/2026, 9:30:59 AM
import java.util.*;

class Solution {
    public int mctFromLeafValues(int[] arr) {
        int cost = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);

        for (int num : arr) {
            while (stack.peek() <= num) {
                int mid = stack.pop();
                cost += mid * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }

        while (stack.size() > 2) {
            cost += stack.pop() * stack.peek();
        }

        return cost;
    }
}