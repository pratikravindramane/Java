import java.util.LinkedList;

public class CollectionLinkedList {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("Linked List");
        list.addFirst("this");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.add("Linked List");
        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());

    }
}
