// Last updated: 9/11/2026, 9:31:52 AM
class Solution {
    public boolean backspaceCompare(String S, String T) {
       return compute(S).equals(compute(T));
    }
    
    private Stack<Character> compute(String S) {
        Stack<Character> stack = new Stack();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
}