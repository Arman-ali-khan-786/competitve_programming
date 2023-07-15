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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode f = head;
        ListNode s = head;
        while( f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
            if(f == s) return true;
        }
        return false;
    }
}
