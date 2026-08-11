// Last updated: 8/11/2026, 2:16:43 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                count[words[i].charAt(j) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}