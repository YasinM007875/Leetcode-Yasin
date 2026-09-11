// Last updated: 9/11/2026, 9:30:21 AM
class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                max=Math.max(max,count);
            }
            else{
                count =1;
            }
        }
        return max;
    }
}