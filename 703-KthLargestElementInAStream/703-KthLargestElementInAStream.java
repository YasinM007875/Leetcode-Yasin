// Last updated: 9/11/2026, 9:32:06 AM
class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int ele : nums){
            if(pq.size() < k){
                pq.add(ele);
            }else if(ele > pq.peek()){
                pq.poll();
                pq.add(ele);
            }        
        }
        
    }
    
    public int add(int val) {
        if(pq.size() < k)
            pq.add(val);
        else if(val>pq.peek()){
            pq.poll();
            pq.add(val);
        } 
        return pq.peek();   
        
    }
}


