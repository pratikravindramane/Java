package LinkedListQuestions;

import java.util.ArrayList;

public class MultiplyTwoLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
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
        // first List
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(1);
        printList(head1);

        // second List
        Node head2 = new Node(1);
        head2.next = new Node(3);
        printList(head2);

        Node curNode1 = head1;
        int result = 0;
        while (curNode1 != null) {
            Node curNode2 = head2;
            int count = 0;
            while (curNode2 != null) {
                System.out.println(curNode2.data);
                int mul = curNode1.data * curNode2.data;
                count += mul;
                curNode2 = curNode2.next;
            }
            result += count;
            System.out.println(count);
            curNode1 = curNode1.next;
        }
        System.out.println(result);
    }

}
