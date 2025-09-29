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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: Split the list into two halves
        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null; // break the list into two halves

        // Step 2: Sort each half
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3: Merge the sorted halves
        return merge(left, right);
    }

    // Helper function: find the middle of the list (slow/fast pointers)
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper function: merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // append the remaining nodes
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}
