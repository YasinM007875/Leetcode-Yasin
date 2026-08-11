// Last updated: 8/11/2026, 2:16:00 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        }
        
        // Case 2: We take all "1"s and some (or all) "0"s
        // The sum stays equal to numOnes because zeros add nothing
        if (k <= numOnes + numZeros) {
            return numOnes;
        }
        
        // Case 3: We are forced to take some "-1"s
        // We take all 1s (sum = numOnes) and all 0s (sum still numOnes)
        // Then we subtract the remaining items needed from that sum
        int remainingK = k - (numOnes + numZeros);
        return numOnes - remainingK;
    }
}