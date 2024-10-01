package Queue;

public class CricularQueue {
    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public void add(int n) {
            if ((rear + 1) % size == front) {
                System.out.println("queue is full");
                return;
            }
            rear = (rear + 1) % size;
            if (front == -1)
                front++;
            arr[rear] = n;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if (result == front)
                rear = front = -1;
            else
                front = (front + 1) % size;
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue l = new Queue(5);
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
