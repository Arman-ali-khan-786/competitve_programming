public class reverseLinkedList {
    // Given a linked list of N nodes. The task is to reverse this list.
    class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    // Function to reverse a linked list.

    // -> recursive method

    Node reverseList(Node head) {
        // code here

        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    // -> iterative method

    Node reverseList2(Node head)
    {
        // code here
        
        if(head == null || head.next == null){
            return head;
        }
        
        
        Node curr = head.next;
        Node prev = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        head.next= null;
        head = prev;
        return head;
        
    }

}
