// Last updated: 9/14/2026, 8:55:18 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        Arrays.sort(nums);
7
8        for (int i = 0; i < nums.length - 2; i++) {
9
10            if (i > 0 && nums[i] == nums[i - 1])
11                continue;
12
13            int left = i + 1;
14            int right = nums.length - 1;
15
16            while (left < right) {
17
18                int sum = nums[i] + nums[left] + nums[right];
19
20                if (sum == 0) {
21
22                    result.add(Arrays.asList(
23                        nums[i], nums[left], nums[right]
24                    ));
25
26                    int leftValue = nums[left];
27                    int rightValue = nums[right];
28
29                    while (left < right && nums[left] == leftValue)
30                        left++;
31
32                    while (left < right && nums[right] == rightValue)
33                        right--;
34
35                }
36                else if (sum < 0) {
37                    left++;
38                }
39                else {
40                    right--;
41                }
42            }
43        }
44
45        return result;
46    }
47}