// Last updated: 9/11/2026, 9:34:11 AM
class Solution {
    public boolean isPowerOfThree(int n) {
    if(n<1)
        return false;
        while(n%3==0){
            n=n/3;
        }
        if(n==1)
        return true;
        else
        return false;
    }
    }
