// Last updated: 9/11/2026, 9:33:00 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int ele:nums2){
            while(!st.isEmpty() && ele>st.peek()){
                m.put(st.pop(),ele);
            }
            st.push(ele);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(m.containsKey(nums1[i]))
                res[i] = m.get(nums1[i]);
            else
                res[i] = -1;    
        }
        return res;
        
    }
}