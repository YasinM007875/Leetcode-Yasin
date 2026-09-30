// Last updated: 9/30/2026, 9:39:41 AM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        if (head == null || left == right)
4            return head;
5
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8
9        ListNode prev = dummy;
10
11        for (int i = 1; i < left; i++) {
12            prev = prev.next;
13        }
14
15        ListNode current = prev.next;
16
17        for (int i = 0; i < right - left; i++) {
18            ListNode next = current.next;
19            current.next = next.next;
20            next.next = prev.next;
21            prev.next = next;
22        }
23
24        return dummy.next;
25    }
26}