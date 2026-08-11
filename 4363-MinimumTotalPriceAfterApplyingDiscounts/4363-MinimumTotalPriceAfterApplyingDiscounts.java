// Last updated: 8/11/2026, 2:13:59 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total = 0.0;
        int i = prices.length-1;
        int j = discounts.length-1;
        while(i >= 0 && j >= 0) {
            total+=prices[i]*(100.0-discounts[j]) / 100.0;
            i--;
            j--;
        }
        while(i>=0){
            total+=prices[i];
            i--;
        }
        return total;
    }
}