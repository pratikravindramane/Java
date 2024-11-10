package LinkedListQuestions;

import java.util.HashSet;

public class RemoveDuplicates {
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
        HashSet<Integer> withoutDuplicates = new HashSet<>();
        Node head = new Node(4);
        head.next = new Node(6);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(8);
        Node currNode = head;
        Node prev = null;
        while (currNode != null) {
            if (withoutDuplicates.contains(currNode.data)) {
                prev.next = currNode.next;
            } else {
                withoutDuplicates.add(currNode.data);
                prev = currNode;
            }
            currNode = currNode.next;
        }
        printList(head);
    }
}
