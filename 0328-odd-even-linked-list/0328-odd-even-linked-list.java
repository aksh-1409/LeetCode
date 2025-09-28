/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode prev = null;
        ListNode temp = head;
        ListNode head1 = null;
        int count = 0;

        while (temp != null) {
            ListNode node = new ListNode();
            node.val = temp.val;   
            count++;
            if (count == 1) {
                head1 = node;
                prev = node;
            } else {
                prev.next = node;
                prev = node;
            }

            if (temp.next == null) break;
            temp = temp.next.next; 
        }

        temp = head.next;
        ListNode prevEven = null, headEven = null;

        while (temp != null) {
            ListNode node = new ListNode();
            node.val = temp.val;

            if (headEven == null) {
                headEven = node;
                prevEven = node;
            } else {
                prevEven.next = node;
                prevEven = node;
            }

            if (temp.next == null) break;
            temp = temp.next.next; 
        }

        prev.next = headEven;

        return head1;
    }
}
