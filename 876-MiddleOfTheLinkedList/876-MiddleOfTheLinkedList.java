// Last updated: 9/11/2026, 9:31:49 AM

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}