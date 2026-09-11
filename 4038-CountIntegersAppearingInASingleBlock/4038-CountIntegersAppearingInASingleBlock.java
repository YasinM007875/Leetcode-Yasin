// Last updated: 9/11/2026, 9:26:49 AM
class Solution {
    public int countSpecialIntegers(int[] nums) {
        // boolean[] seen = new boolean[101];
        // boolean[] bad = new boolean[101];
        // for(int i=0;i<nums.length;i++){
        //     int x = nums[i];
        //     if(i>0 && nums[i-1] !=x && seen[x])
        //             bad[x] = true;
        // }
        // int ans = 0;
        // for(int i=0;i<=100;i++)
        //     if(seen[i] && !bad[i])
        //         ans++;
        // return ans;
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> bad = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i] != nums[i-1]){
                if(seen.contains(nums[i]))
                    bad.add(nums[i]);
                else
                    seen.add(nums[i]);
            }    
        }
        return seen.size()-bad.size();
    }
}