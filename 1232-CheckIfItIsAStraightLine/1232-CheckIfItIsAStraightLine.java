// Last updated: 9/11/2026, 9:30:39 AM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y2 - y1) * (x - x1) != (y - y1) * (x2 - x1)) {
                return false;
            }
        }

        return true;
    }
}