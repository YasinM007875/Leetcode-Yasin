// Last updated: 8/11/2026, 2:19:17 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0)
        return n;
        if(n<3)
        return 1;
        int n1=0,n2=1,n3=1,ans=0;
        for(int i=3;i<=n;i++){
            ans=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=ans;
        }
            
        return ans;
        
    }
}