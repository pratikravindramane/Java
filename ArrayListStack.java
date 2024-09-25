import java.util.ArrayList;

public class ArrayListStack {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static  boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty())
                return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }
        public  int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
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
