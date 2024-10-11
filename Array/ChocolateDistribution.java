import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        Arrays.sort(arr);
        int m = 5;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - m; i++) {
            int min = arr[i];
            int max = arr[i + m - 1];
            int diff = max - min;
            if (diff < minDiff)
                minDiff = diff;
        }
        System.out.println(minDiff);
    }
}
