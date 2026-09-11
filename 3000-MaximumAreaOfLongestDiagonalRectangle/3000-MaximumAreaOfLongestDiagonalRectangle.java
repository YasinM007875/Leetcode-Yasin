// Last updated: 9/11/2026, 9:28:19 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {

            int length = rect[0];
            int width = rect[1];

            int diagonal = length * length + width * width;
            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal && area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}