//############################# PROBLEM OF THE DAY - 23th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

// You are given a Binary Search Tree and a target value. You must find the maximum difference between the sum of node data from root to target and from target to a child leaf node (target exclusive). Initially, you are at the root node.
// Note: If the target node is not present in the tree then return -1.

package potd;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class bst_max_diff {
    public static int minpath(Node root){
        if(root == null) return 0;
        int sum = root.data;
        
        if(root.left == null) sum+=minpath(root.right);
        else if(root.right == null) sum+=minpath(root.left);
        else sum+=Math.min(minpath(root.left),minpath(root.right));
        
        return sum;
    }
    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here
        int rootSum = 0,leafSum =0;
        while(root!=null){
            rootSum+=root.data;
            if(target == root.data) break;
            if(target<root.data) root=root.left;
            else root=root.right;
        }
        if(root == null) return -1;
        leafSum=minpath(root);
        
        return rootSum-leafSum;
        
        
        
    }
}
