// Last updated: 9/11/2026, 9:28:54 AM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;
        else if(n%2!=0)
        return n;
        else
        return n/2;
        
    }
}