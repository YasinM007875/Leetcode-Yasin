// Last updated: 9/16/2026, 9:26:59 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9                if (board[i][j] == '.') {
10                    continue;
11                }
12
13                int num = board[i][j] - '1';
14                int box = (i / 3) * 3 + (j / 3);
15
16                if (rows[i][num] || cols[j][num] || boxes[box][num]) {
17                    return false;
18                }
19
20                rows[i][num] = true;
21                cols[j][num] = true;
22                boxes[box][num] = true;
23            }
24        }
25
26        return true;
27    }
28}