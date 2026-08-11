// Last updated: 8/11/2026, 2:17:09 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                count--;
            }
        }

        return count == 0;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}