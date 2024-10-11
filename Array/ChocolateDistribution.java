import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        Arrays.sort(arr);
        int m = 5;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < m; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max - min);
    }
}
