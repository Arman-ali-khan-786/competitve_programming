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
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode t = new ListNode(0);
       t.next = head;
       ListNode curr = t;

       while(curr.next!=null && curr.next.next!=null){
           ListNode f = curr.next;
           ListNode s = curr.next.next;

           curr.next = s;
           f.next = s.next;
           s.next = f;
           curr = curr.next.next;
       }
       return t.next;
        
    }
}
