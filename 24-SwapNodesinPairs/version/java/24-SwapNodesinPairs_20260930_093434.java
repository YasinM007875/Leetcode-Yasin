// Last updated: 9/30/2026, 9:34:34 AM
1
2class Solution {
3    public ListNode swapPairs(ListNode head) {
4        if(head == null || head.next == null)
5            return head;
6        ListNode Second = head.next;
7        head.next = swapPairs(Second.next);
8        Second.next = head;
9        return Second;    
10    }
11}