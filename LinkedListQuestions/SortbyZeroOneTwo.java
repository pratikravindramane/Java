package LinkedListQuestions;

import java.util.Arrays;

public class SortbyZeroOneTwo {
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
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        printList(head);

        int[] arr = { 0, 0, 0 };
        Node currNode = head;
        while (currNode != null) {
            arr[currNode.data] += 1;
            currNode = currNode.next;
        }

        int idx = 0;
        currNode = head;
        while (currNode != null) {
            if (arr[idx] == 0)
                idx += 1;
            else {
                currNode.data = idx;
                arr[idx] -= 1;
                currNode = currNode.next;
            }
        }
        printList(head);
    }
}
