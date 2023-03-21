class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class addOneToLinkedListNumber {

    public static int checkCarry(Node head){
        if(head.next == null){
            head.data+=1;
            if(head.data>9){
                head.data = 0;
                return 1;
            }
            return 0;
        }
        int carry = checkCarry(head.next);
        head.data+=carry;
        if(head.data > 9){
            head.data =0;
            return 1;
        }
        return 0;
    }
    
    public static Node addOne(Node head) 
    { 
        if(head == null) return head;
        //code here.
        int carry = checkCarry(head);
        if(carry==1){
            Node start = new Node(1);
            start.next = head;
            head = start;
        }
        
        return head;
        
    }
}
