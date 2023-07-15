class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode p = head;
        while(p.next!=null){
            ListNode q = p.next;
            if(p.val == q.val){
                p.next = q.next;
            }
            else p=p.next;
        }
        return head;
        
    }
}
