/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.Hashtable;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if( head==null || head.next==null)
        return null;

        ListNode temp = head;
       // ListNode prev = null;
        Hashtable<ListNode,Integer> reff = new Hashtable<>();
        while(temp!=null){
            if(reff.containsKey(temp)){
                break;
            }
            reff.put(temp,1);
            //prev = temp;
            temp = temp.next;
        }
        if(temp==null)
        return null;

        return temp;
    }
}