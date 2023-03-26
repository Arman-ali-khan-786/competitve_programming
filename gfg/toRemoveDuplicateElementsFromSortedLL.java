class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

public class toRemoveDuplicateElementsFromSortedLL{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	if(head == null || head.next == null) return head;
	Node curr = head;
	while(curr!=null && curr.next!=null){
	    if(curr.data == curr.next.data){
	        Node t = curr.next;
	        curr.next = curr.next.next;
	        t.next = null;
	    }else curr=curr.next;
	}
	return head;
    }
}