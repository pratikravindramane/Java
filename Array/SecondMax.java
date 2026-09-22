public class SecondMax {
    public static void main(String[] args) {
        // int[] arr = new int[] { 12, 35, 1, 10, 34, 1 };
        int[] arr = new int[] { 10, 5, 10 };
        // int[] arr = new int[] { 10, 10, 10 };
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (max < n) {
                max2 = max;
                max = n;
            } else if (n > max2 && n < max) {
                max2 = n;
            }
        }
        System.out.println(max2);
    }
}
