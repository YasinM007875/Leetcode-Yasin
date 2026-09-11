// Last updated: 9/11/2026, 9:42:55 AM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        return Integer.bitCount(x ^ y);
4    }
5}