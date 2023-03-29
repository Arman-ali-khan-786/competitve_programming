import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class reverseLevelOrderTraversal {
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
       Stack<Integer> stk = new Stack<>();
       Queue<Node> q = new LinkedList<>();
       ArrayList<Integer> al = new ArrayList<>();
       q.add(node);
       while(!q.isEmpty()){
           Node n = q.poll();
           stk.add(n.data);
           
           if(n.right!=null) q.add(n.right);
           if(n.left!=null) q.add(n.left);
           
           
       }
       while(!stk.isEmpty()){
           al.add(stk.pop());
       }
       return al;
    }
}
