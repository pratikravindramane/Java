public class Reverse {
    public static void rReverse(int arr[], int count, int newArr[]) {
        if (count == arr.length) {
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i]);
            }
            return;
        }
        newArr[count] = arr[arr.length - 1 - count];
        rReverse(arr, count + 1, newArr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int newArr[] = new int[arr.length];
        rReverse(arr, 0, newArr);

    }
}
