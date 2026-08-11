// Last updated: 8/11/2026, 2:14:01 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s = startTime.split(":");
        String[] e = endTime.split(":");
        int a = Integer.parseInt(s[0])*3600+Integer.parseInt(s[1])*60+Integer.parseInt(s[2]);
        int b = Integer.parseInt(e[0])*3600+Integer.parseInt(e[1])*60+Integer.parseInt(e[2]);
        return b-a;
        
    }
}