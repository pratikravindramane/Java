public class StackClass {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (head == null)
                return -1;
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek() {
            if (isEmpty())
                return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack kabaddi = new Stack();
        kabaddi.push(1);
        kabaddi.push(2);
        kabaddi.push(3);
        kabaddi.push(4);
        while (!kabaddi.isEmpty()) {
            System.out.println(kabaddi.peek());
            kabaddi.pop();
        }
    }

}
