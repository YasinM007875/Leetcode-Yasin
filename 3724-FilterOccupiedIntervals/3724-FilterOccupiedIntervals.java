// Last updated: 8/11/2026, 2:15:02 PM
import java.util.*;
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> result = new ArrayList<>();
        if(occupiedIntervals==null || occupiedIntervals.length==0)
            return result;
        Arrays.sort(occupiedIntervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = occupiedIntervals[0];
        for(int i=1;i<occupiedIntervals.length;i++){
            int[] next=occupiedIntervals[i];
            if(next[0] <= current[1]+1){
                current[1]=Math.max(current[1],next[1]);
            } else {
                merged.add(current);
                current=next;
            }
        }
        merged.add(current);
        for(int[] interval : merged) {
            int s = interval[0];
            int e = interval[1];
            if(e < freeStart || s > freeEnd){
                addInterval(result,s,e);
            } 
            else {
                if(s < freeStart) {
                    addInterval(result,s,freeStart-1);
                }
                if(e>freeEnd){
                    addInterval(result,freeEnd+1,e);
                }
                
            }
        }
        return result;
    }
    private void addInterval(List<List<Integer>> result,int s,int e) {
        if(s <= e){
            List<Integer> pair = new ArrayList<>();
            pair.add(s);
            pair.add(e);
            result.add(pair);
        }
    }
}