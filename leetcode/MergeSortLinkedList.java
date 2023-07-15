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
        if(head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
        
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode h = new ListNode();
        ListNode t = h;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                t.next = l1;
                l1 = l1.next;
            }else{
                t.next = l2;
                l2=l2.next;
            }
            t=t.next;
        }
        t.next = (l1 != null) ? l1 : l2;
        return h.next;

    }

    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
