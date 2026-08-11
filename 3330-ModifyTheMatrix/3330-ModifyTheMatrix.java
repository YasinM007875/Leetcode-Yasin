// Last updated: 8/11/2026, 2:15:08 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int col = 0; col < n; col++) {

            int max = 0;

            for (int row = 0; row < m; row++) {
                max = Math.max(max, matrix[row][col]);
            }

            for (int row = 0; row < m; row++) {
                if (matrix[row][col] == -1) {
                    matrix[row][col] = max;
                }
            }
        }

        return matrix;
    }
}