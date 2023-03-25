import java.util.ArrayList;

class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
public class preOrderTraversal {
    static ArrayList<Integer> preorderHelper(ArrayList<Integer> al, Node root){
        if(root == null) return al;
        al.add(root.data);
        preorderHelper(al,root.left);
        preorderHelper(al,root.right);
        
        return al;
        
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        return preorderHelper(new ArrayList<Integer>(),root);
        
    }
}
