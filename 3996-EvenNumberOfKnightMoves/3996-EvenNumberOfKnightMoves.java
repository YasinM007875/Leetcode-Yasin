// Last updated: 9/11/2026, 9:27:04 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sc=(start[0]+start[1]) % 2;
        int tc=(target[0]+target[1]) % 2;
        return sc == tc;
    }
}