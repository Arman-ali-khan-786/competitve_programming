import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class minElementInBST {
    int minValue(Node node) {
        if(node==null) return -1;
        if(node.left == null) return node.data;
        int min = Integer.MAX_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node ele = q.poll();
            min=Math.min(min,ele.data);
            if(ele.left!=null) q.add(ele.left);
        }
        if(min!=Integer.MAX_VALUE) return min;
        return -1;
    }
}
