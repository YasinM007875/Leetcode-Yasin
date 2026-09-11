// Last updated: 9/11/2026, 9:28:36 AM
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) &&
                    words[i].charAt(1) == words[j].charAt(0)) {
                    count++;
                }
            }
        }

        return count;
    }
}