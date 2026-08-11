// Last updated: 8/11/2026, 2:18:11 PM
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