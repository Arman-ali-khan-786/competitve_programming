import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class rightViewOfBinaryTree {
    static ArrayList<Integer> helper(Node root, int lvl, ArrayList<Integer> al) {
        if (root == null)
            return al;
        if (lvl == al.size())
            al.add(root.data);

        helper(root.right, lvl + 1, al);
        helper(root.left, lvl + 1, al);

        return al;
    }

    ArrayList<Integer> rightView(Node node) {
        // add code here.
        return helper(node, 0, new ArrayList<Integer>());
    }
}
