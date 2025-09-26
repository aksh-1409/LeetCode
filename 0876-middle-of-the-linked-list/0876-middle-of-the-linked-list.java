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
    public ListNode middleNode(ListNode head) {
        // int count = 0;
        // ListNode temp  = head;
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }
        // int newHead = 0;
        // if(count%2==0)
        //     newHead = (count/2) + 1;
        // else
        // newHead = (int)Math.ceil(count/2.0);

        // while(newHead!=1){
        //     newHead--;
        //     head = head.next;
        // }    
        // return head; 


        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}