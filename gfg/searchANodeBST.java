public class searchANodeBST {
    boolean search(Node root, int x) {
        // Your code here
        if(root == null) return false;
        if(root.data == x) return true;
        
        if(x<root.data){
            return search(root.left,x);
        }
        if(x>root.data){
           return search(root.right,x);
        }
        return false;
    }
}
