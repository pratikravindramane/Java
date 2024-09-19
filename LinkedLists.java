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

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addToStart("2");
        list.addToStart("1");
        list.addToLast("3");
        list.print();
        list.reverList();
        list.print();
        list.recursiveReverse(list.head);
        list.print();
        // list.deleteFirst();
        // list.print();
        // list.deleteFirst();
        // list.print();
        System.out.println(list.printSize());
        // reverList(list);

    }

}
