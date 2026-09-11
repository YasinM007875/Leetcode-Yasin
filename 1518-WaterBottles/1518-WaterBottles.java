// Last updated: 9/11/2026, 9:30:13 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            int remainingEmpty = emptyBottles % numExchange;
            
            totalDrunk += newBottles;
            
            // Your new empty bottles are the ones you just drank 
            // plus the ones you couldn't exchange earlier
            emptyBottles = newBottles + remainingEmpty;
        }

        return totalDrunk; 
    }
}