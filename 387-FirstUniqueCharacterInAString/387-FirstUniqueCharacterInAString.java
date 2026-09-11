// Last updated: 9/11/2026, 9:33:46 AM
class Solution {
    public int firstUniqChar(String s) {
        // Since we only have 'a'-'z', an array of size 26 is enough
        int[] count = new int[26];
        int n = s.length();
        
        // Build the frequency map
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        // Find the first index where the character count is 1
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}