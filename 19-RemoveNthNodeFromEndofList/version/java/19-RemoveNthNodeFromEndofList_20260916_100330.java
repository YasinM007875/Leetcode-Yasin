// Last updated: 9/16/2026, 10:03:30 AM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode first = dummy;
7        ListNode second = dummy;
8
9        for (int i = 0; i <= n; i++) {
10            first = first.next;
11        }
12
13        while (first != null) {
14            first = first.next;
15            second = second.next;
16        }
17
18        second.next = second.next.next;
19
20        return dummy.next;
21    }
22}