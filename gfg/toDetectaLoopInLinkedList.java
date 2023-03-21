public class toDetectaLoopInLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static boolean detectLoop(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        if (head.next == head)
            return true;
        // Add code here
        Node turtle = head;
        Node hare = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (turtle == hare) {
                return true;
            }
        }
        return false;
    }
}
