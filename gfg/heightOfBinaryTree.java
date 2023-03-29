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
public class heightOfBinaryTree {
    int height(Node node) 
    {
        // code here 
        if(node == null) return 0;
        
        int leftH = height(node.left)+1;
        int rightH= height(node.right)+1;
        
        return (int)Math.max(leftH,rightH);
    }
}
