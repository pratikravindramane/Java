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

    Node head;

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

    public void reverList(LinkedLists list) {
        String lastElement;
        for (int i = size - 1; i >= 0; i--) {
            if (i == size - 1)
                lastElement = ;
        }
    }
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addToStart("first");
        list.addToStart("new first");
        list.addToLast("last");
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteFirst();
        list.print();
        System.out.println(list.printSize());
        reverList(list);

    }

}
