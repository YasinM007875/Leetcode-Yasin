// Last updated: 8/11/2026, 2:16:47 PM
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int pos = word.charAt(word.length() - 1) - '0';

            ans[pos - 1] = word.substring(0, word.length() - 1);
        }

        String result = "";

        for (int i = 0; i < ans.length; i++) {
            result += ans[i];

            if (i != ans.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}