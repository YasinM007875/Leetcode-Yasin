// Last updated: 8/11/2026, 2:15:40 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
       int totalUsed = 0;
        
        while (mainTank >= 5) {
            // Spend 5 liters
            mainTank -= 5;
            totalUsed += 5;
            
            // If we have fuel in the backup, move 1 liter to main
            if (additionalTank > 0) {
                additionalTank--;
                mainTank += 1;
            }
        }
        
        // Add the leftover fuel in the main tank to total used
        totalUsed += mainTank;
        
        // Multiply by mileage (10 km/liter)
        return totalUsed * 10; 
    }
}