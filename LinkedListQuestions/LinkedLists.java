package LinkedListQuestions;

import java.util.LinkedList;

public class LinkedLists {
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    static Node head;

    public void addToStart(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addToLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        if (head.next == null) {
            System.out.println("Single Item Linked List Can't Do Delete Operation");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node last = head.next;
        Node sLast = head;
        while (last.next != null) {
            last = last.next;
            sLast = sLast.next;
        }
        sLast.next = null;
        // currentNode.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "=>");
            currentNode = currentNode.next;
        }
        System.out.println("NUll");
    }

    public int printSize() {
        return size;
    }

    public void reverList() {
        if (head == null || head.next == null)
            return;

        Node prevNode = head;
        Node curNode = head.next;

        while (curNode != null) {
            Node newNode = curNode.next;
            curNode.next = prevNode;

            // update
            prevNode = curNode;
            curNode = newNode;
        }

        head.next = null;
        head = prevNode;
    }

    public void recursiveReverse(Node currentNode) {
        if (currentNode == null || currentNode.next == null) {
            head = currentNode;
            return;
        }

        recursiveReverse(currentNode.next);

        currentNode.next.next = currentNode;
        currentNode.next = null;
    }

    public void removeNthFromLast(int n) {
        // retrun if the starting values are null
        if (head == null || head.next == null)
            return;
        if (n > size) {
            System.out.println("Enter a smaller Integer");
            return;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int idx = size - n;

        Node prevNode = head;
        int count = 1;
        while (count < idx) {
            prevNode = prevNode.next;
            count++;
        }
        prevNode.next = prevNode.next.next;
    }

    public Node findMiddle(Node givNode) {
        Node rabit = head;
        Node turtle = head;
        while (rabit.next != null && rabit.next.next != null) {
            rabit.next = rabit.next.next;
            turtle.next = turtle.next;
        }
        return turtle;
    }

    public Node reverFromNthNode(Node givenNode) {
        Node prevNode = null;
        Node curNode = givenNode;

        while (curNode != null) {
            Node next = curNode.next;
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = next;
        }
        return prevNode;
    }

    public boolean isPalindrome(Node givenNode) {
        if (givenNode == null || givenNode.next == null)
            return true;

        Node middlNode = findMiddle(givenNode);
        Node secondHalfStart = reverFromNthNode(middlNode.next);

        Node firtHalftStart = head;
        while (secondHalfStart != null) {
            if (firtHalftStart.data != secondHalfStart.data)
                return false;
            firtHalftStart = firtHalftStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public boolean isCycle(Node givNode) {
        Node rabit = givNode;
        Node turtle = givNode;

        while (rabit != null && rabit.next != null) {
            rabit = rabit.next.next;
            turtle = turtle.next;
            if (rabit == turtle)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addToStart("b");
        list.addToStart("a");
        list.addToLast("c");
        // list.addToLast("c");
        list.addToLast("b");
        list.addToLast("a");
        list.print();
        // list.print();
        // list.reverList();
        // list.print();
        // list.recursiveReverse(list.head);
        // list.deleteFirst();
        // list.print();
        // list.deleteFirst();
        // list.removeNthFromLast(2);
        // list.print();
        // System.out.println(list.isPalindrome(head));
        System.out.println(list.isCycle(head));

        // reverList(list);

    }

}
