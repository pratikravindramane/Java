import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int k = 3;
        ArrayList<Integer> newArr = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            newArr.add(arr.get(i));
        }
        for (int i = k; i < arr.size(); i++) {
            newArr.remove(0);
            newArr.add(arr.get(i));
            System.out.println(newArr);
        }
    }
}
