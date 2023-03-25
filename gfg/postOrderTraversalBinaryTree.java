import java.util.ArrayList;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class postOrderTraversalBinaryTree {
    static ArrayList<Integer> postOrderHelper(ArrayList<Integer> al,Node root){
        if(root == null) return al;
        postOrderHelper(al,root.left);
        postOrderHelper(al,root.right);
        al.add(root.data);
        return al;
    }
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       return postOrderHelper(new ArrayList<Integer>(), root);
    }
}
