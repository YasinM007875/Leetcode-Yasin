// Last updated: 8/11/2026, 2:16:21 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
    int a;
    int ans=0;
    int temp=num;
    int d,rev=0;
    while(num!=0){
        a=num%10;
        ans=ans*10+a;
        num/=10;
    }
    while(ans!=0){
        d=ans%10;
        rev=rev*10+d;
        ans/=10;

    }
    if(temp==rev)
    return true;
    else 
    return false;
    }
    }