// Last updated: 9/11/2026, 9:30:15 AM
class Solution {
    public int countOdds(int low, int high) {
       if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }       
        return (high - low) / 2 + 1; 
    }
}