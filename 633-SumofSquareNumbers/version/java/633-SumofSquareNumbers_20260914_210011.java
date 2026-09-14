// Last updated: 9/14/2026, 9:00:11 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3
4        long left = 0;
5        long right = (long) Math.sqrt(c);
6
7        while (left <= right) {
8
9            long sum = left * left + right * right;
10
11            if (sum == c)
12                return true;
13
14            else if (sum < c)
15                left++;
16
17            else
18                right--;
19        }
20
21        return false;
22    }
23}
24