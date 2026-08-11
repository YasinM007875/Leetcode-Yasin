// Last updated: 8/11/2026, 2:21:30 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;

        return str.contains(goal);
    }
}