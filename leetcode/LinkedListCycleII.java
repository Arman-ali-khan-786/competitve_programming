/*
Link : https://leetcode.com/problems/linked-list-cycle-ii/description/?envType=study-plan&id=level-1
*/

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
    public ListNode detectCycle(ListNode head) {
        ListNode turtle = head;
        ListNode hare = head;
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare = hare.next.next;
            if(turtle==hare){
                turtle = head;
                while(turtle!=hare){
                    turtle=turtle.next;
                    hare = hare.next;
                }
                return turtle;
            }
        }
        return null;
    }
}
