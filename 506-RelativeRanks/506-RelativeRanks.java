// Last updated: 9/11/2026, 9:32:56 AM
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] result = new String[n];

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        HashMap<Integer, String> map = new HashMap<>();

        int rank = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (rank == 1) {
                map.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            } else {
                map.put(sorted[i], String.valueOf(rank));
            }

            rank++;
        }

        for (int i = 0; i < n; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}