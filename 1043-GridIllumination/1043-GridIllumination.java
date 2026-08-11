// Last updated: 8/11/2026, 2:20:06 PM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {

        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> antiDiag = new HashMap<>();

        Set<Long> activeLamps = new HashSet<>();

        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];

            long key = ((long) r << 32) | c;

            if (activeLamps.contains(key))
                continue;

            activeLamps.add(key);

            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            antiDiag.put(r + c, antiDiag.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 0}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int i = 0; i < queries.length; i++) {

            int r = queries[i][0];
            int c = queries[i][1];

            if (rows.containsKey(r) ||
                cols.containsKey(c) ||
                diag.containsKey(r - c) ||
                antiDiag.containsKey(r + c)) {
                ans[i] = 1;
            }

            for (int[] d : directions) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;

                long key = ((long) nr << 32) | nc;

                if (!activeLamps.contains(key))
                    continue;

                activeLamps.remove(key);

                decrease(rows, nr);
                decrease(cols, nc);
                decrease(diag, nr - nc);
                decrease(antiDiag, nr + nc);
            }
        }

        return ans;
    }

    private void decrease(Map<Integer, Integer> map, int key) {
        int count = map.get(key);

        if (count == 1)
            map.remove(key);
        else
            map.put(key, count - 1);
    }
}