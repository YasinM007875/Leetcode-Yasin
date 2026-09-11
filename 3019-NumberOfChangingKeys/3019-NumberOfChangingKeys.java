// Last updated: 9/11/2026, 9:28:10 AM
class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            char prev = Character.toLowerCase(s.charAt(i - 1));
            char curr = Character.toLowerCase(s.charAt(i));

            if (prev != curr) {
                count++;
            }
        }

        return count;
    }
}