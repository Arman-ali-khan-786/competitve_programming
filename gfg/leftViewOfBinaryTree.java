import java.util.ArrayList;
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
public class leftViewOfBinaryTree {
    static void helper(Node root,int lvl,ArrayList<Integer> al){
        if(root == null) return;
        if(lvl == al.size()) al.add(root.data);
        
        helper(root.left,lvl+1,al);
        helper(root.right,lvl+1,al);
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> al =new ArrayList<>();
      helper(root,0,al);
      return al;
      
    }
}
