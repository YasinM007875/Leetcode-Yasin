// Last updated: 9/11/2026, 9:30:31 AM
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;        
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        
               return steps;
    }
}  
    
