/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Hashtable<ListNode,Integer> table = new Hashtable<>();
        Boolean flag = false;
        ListNode temp = headA;
        while(temp!=null){
          table.put(temp,1);
          temp = temp.next;
        }

        temp = headB;
        while(temp!=null){
          if(table.containsKey(temp)){
          flag = true;
          break;      
        }
        temp = temp.next;
        }
        
        if(flag)
        return temp;

        return null;
    }
}
