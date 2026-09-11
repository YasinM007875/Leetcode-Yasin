// Last updated: 9/11/2026, 9:31:41 AM
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcdValue = 0;

        for (int count : map.values()) {
            gcdValue = gcd(gcdValue, count);
        }

        return gcdValue >= 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}