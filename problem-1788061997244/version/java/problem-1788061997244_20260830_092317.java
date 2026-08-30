// Last updated: 8/30/2026, 9:23:17 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        // boolean[] seen = new boolean[101];
4        // boolean[] bad = new boolean[101];
5        // for(int i=0;i<nums.length;i++){
6        //     int x = nums[i];
7        //     if(i>0 && nums[i-1] !=x && seen[x])
8        //             bad[x] = true;
9        // }
10        // int ans = 0;
11        // for(int i=0;i<=100;i++)
12        //     if(seen[i] && !bad[i])
13        //         ans++;
14        // return ans;
15        HashSet<Integer> seen = new HashSet<>();
16        HashSet<Integer> bad = new HashSet<>();
17        for(int i=0;i<nums.length;i++){
18            if(i==0 || nums[i] != nums[i-1]){
19                if(seen.contains(nums[i]))
20                    bad.add(nums[i]);
21                else
22                    seen.add(nums[i]);
23            }    
24        }
25        return seen.size()-bad.size();
26    }
27}