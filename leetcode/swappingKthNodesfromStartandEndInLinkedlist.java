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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next ==null) return head;
        ListNode curr = head;
        int n = 1;
        while(n++<k){
            curr=curr.next;
        }
        ListNode f = curr;
        ListNode s = head;

        while(curr.next!=null){
            curr = curr.next;
            s = s.next;
        }
        int temp = f.val;
        f.val = s.val;
        s.val = temp;

        return head;
    }
}
