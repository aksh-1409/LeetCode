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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: find size
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: calculate target position from start
        int nodeNum = size - (n - 1); // nth from end = nodeNum-th from start

        // Special case: removing the head
        if (nodeNum == 1) {
            return head.next;
        }

        // Step 3: traverse and remove
        temp = head;
        ListNode prev = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == nodeNum) {
                prev.next = temp.next; // skip target node
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
