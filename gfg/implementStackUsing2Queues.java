import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsing2Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q2.add(a);
	    while(!q1.isEmpty()){
	        q2.add(q1.peek());
	        q1.remove();
	    }
	    while(!q2.isEmpty()){
	        q1.add(q2.peek());
	        q2.remove();
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    while(q1.isEmpty()) return -1;
	    
	    return q1.remove();
	    
    }
}
