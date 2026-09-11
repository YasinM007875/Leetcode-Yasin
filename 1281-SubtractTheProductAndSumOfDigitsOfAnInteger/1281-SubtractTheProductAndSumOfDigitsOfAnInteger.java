// Last updated: 9/11/2026, 9:30:36 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int sum=0;
        int mul=1;
        int d;
        int a;
        while(n!=0){
            d=n%10;
                sum+=d;
                n=n/10;
        }
        while(temp!=0){
             a=temp%10;
                mul=mul*a;
                temp=temp/10;
        }
return mul-sum;
        
    }
}