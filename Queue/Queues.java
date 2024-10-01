package Queue;

public class Queues {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public void add(int n) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            arr[++rear] = n;
        };

        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue l = new Queue(5);
        l.add(2);
        l.add(1);
        l.add(4);
        l.add(1);
        l.add(6);
        while (!l.isEmpty()) {
            System.out.println(l.peek());
            l.remove();
        }

    }
}
