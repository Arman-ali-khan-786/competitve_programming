class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
public class reverseLinkedListInGroups {
    // Reverse a Linked List in groups of given size.
    public static Node reverse(Node node, int k)
    {
        //Your code here
       
        if(node == null) return null;
        
        int c =0;
        Node prev = null;
        Node curr = node;
        Node next=null;
        while(curr!=null && c<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            c++;
        }
        if(next!=null){
            node.next = reverse(next,k);
        }
       
        return prev;
    }
}
