// Last updated: 9/11/2026, 9:33:25 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]==b[1] ? b[0] - a[0] : a[1]-b[1]);
        int c=0;
        int end=Integer.MIN_VALUE;
        for(int[] movie : intervals){
            if(movie[0]>=end)
                end = movie[1];
            else
                c++;    
        }
        return c;
    }
}