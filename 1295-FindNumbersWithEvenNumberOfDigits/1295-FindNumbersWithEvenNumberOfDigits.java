// Last updated: 9/11/2026, 9:30:33 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;       
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }       
        return count;
    }
}
    
