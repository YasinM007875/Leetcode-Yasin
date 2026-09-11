// Last updated: 9/11/2026, 9:27:20 AM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;

        if(s>9*n) return -1;

       int ans=0;
        while(n>0){
            int digit=Math.min(9,s);
            ans=ans*10+digit;
            s-=digit;
            n--;
        }
        return ans;
        
    }
}