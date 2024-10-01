package Queue;

public class CricularQueueByLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int n) {
            Node newNode = new Node(n);
            if (tail == null)
                head = tail = newNode;

            tail.next = newNode;
            tail = newNode;

        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail)
                tail = null;
            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue l = new Queue();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l.remove());
        l.add(6);
        System.out.println(l.peek());
        l.add(7);
        while (!l.isEmpty()) {
            System.out.println(l.peek());
            l.remove();
        }

    }
}
