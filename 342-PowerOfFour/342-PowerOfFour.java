// Last updated: 9/11/2026, 9:34:02 AM
class Solution {
    public boolean isPowerOfFour(int n) {
         if(n<1)
        return false;

        if(n==1)
        return true;
        while(n%4==0){
            n=n/4;
        }
        if(n==1)
        return true;
        else
        return false;
    }
        
    }
