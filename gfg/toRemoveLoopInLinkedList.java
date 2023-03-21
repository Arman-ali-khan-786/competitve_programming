public class toRemoveLoopInLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        if(head == null) return;
        // remove the loop without losing any nodes
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                if(slow==fast){
                    while(fast.next!=slow){
                        fast=fast.next;
                    }
                }else{
                    while(slow.next!=fast.next){
                        slow=slow.next;
                        fast=fast.next;
                    }
                }
                fast.next=null;
                return;
            }
        }
    }
}
