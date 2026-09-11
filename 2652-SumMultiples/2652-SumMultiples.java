// Last updated: 9/11/2026, 9:28:41 AM
class Solution {
    public int sumOfMultiples(int n) {
     int totalSum = 0;       
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                totalSum += i;
            }
        }
        
        return totalSum;   
    }
}