// Last updated: 8/11/2026, 2:18:02 PM
class Solution {
    public int countOdds(int low, int high) {
       if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }       
        return (high - low) / 2 + 1; 
    }
}