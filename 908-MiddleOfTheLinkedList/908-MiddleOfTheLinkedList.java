// Last updated: 8/11/2026, 2:20:55 PM

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