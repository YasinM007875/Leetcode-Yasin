// Last updated: 9/11/2026, 9:27:34 AM
import java.util.*;
class Solution{
    public long maxSum(int[] nums,int k,int mul){
        Arrays.sort(nums);
        long totalSum = 0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            long currentElement=nums[n-1-i];
            long a1=currentElement;
            long a2 = currentElement*mul;
            totalSum+=Math.max(a1,a2);
            mul--;
        }
        return totalSum;
        
    }
}