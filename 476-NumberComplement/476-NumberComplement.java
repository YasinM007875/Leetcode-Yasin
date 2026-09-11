// Last updated: 9/11/2026, 9:33:05 AM
class Solution {
    public int findComplement(int num) {
         int mask=0;
        int temp;
        temp=num;
        while(temp>0){
           mask=(mask<<1);
           mask=mask^1;
           temp>>=1;
        }
       return mask^num;
        
    }
}