// Last updated: 9/11/2026, 9:32:01 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;

        return str.contains(goal);
    }
}