package LinkedListQuestions;

public class DeleteWithoutHead {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static void DeleteNode(Node delNode) {
        if (delNode == null || delNode.next == null)
            return;
        System.out.println(delNode.data);

        delNode.data = delNode.next.data;
        delNode.next = delNode.next.next;

    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);

        // Delete the node with value 6
        DeleteNode(head.next.next);

        printList(head);
    }

}
