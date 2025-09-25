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
    public boolean hasCycle(ListNode head) {
        if( head==null || head.next==null)
        return false;

        ListNode temp = head;
        boolean flag = false;
        Hashtable<ListNode,Integer> reff = new Hashtable<>();
        while(temp!=null){
            if(reff.containsKey(temp)){
                flag = true;
                break;
            }
            reff.put(temp,1);
            temp = temp.next;
        }
        if(temp==null)
        return false;

        return flag;
    }
}