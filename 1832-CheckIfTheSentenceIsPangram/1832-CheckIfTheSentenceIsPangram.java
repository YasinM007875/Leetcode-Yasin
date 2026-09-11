// Last updated: 9/11/2026, 9:29:38 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            seen[sentence.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                return false;
            }
        }

        return true;
    }
}