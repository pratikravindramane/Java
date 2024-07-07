import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void minMax(int arr[], int min, int max, int count) {
        if (count == arr.length) {
            System.out.println("minimun: " + arr[min]);
            System.out.println("maximum: " + arr[max]);
            return;
        }
        if (arr[min] > arr[count]) {

            min = count;
        }
        if (arr[count] > arr[max]) {
            max = count;
        }
        minMax(arr, min, max, count + 1);
    }

    public static void forMinMax(int arr[]) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        System.out.println(arr[min]);
        System.out.println(arr[max]);
    }

    public static void reverse(int arr[], int count, int newArr[]) {
        if (count < 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(newArr[i]);
            }
            return;
        }
        newArr[arr.length - count - 1] = arr[count];
        reverse(arr, count - 1, newArr);
    }

    public static void forReverse(int arr[]) {
        int nArr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr.length - i);
            nArr[arr.length - i - 1] = arr[i];
        }
        for (int j = 0; j < nArr.length; j++) {
            System.out.print(nArr[j]);
        }
    }

    public static int distribution(int arr[], int m) {
        if(arr.length==0||m==0){
            return 0;
        }
        // sorting the value
        Arrays.sort(arr);
        if(arr.length-1<m) return -1;
        // getting the maximum min value
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int nextWindow = i+m-1;
            if(nextWindow>=arr.length) break;
            int diff = arr[nextWindow] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }

    public static void main(String arg[]) {
        // Chocolate Distribution Problem
        int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m = 5;
        System.out.println(distribution(arr, m));
        // Reverse an array
        // int arr[] = { 3, 5, 4, 1, 9 };
        // int newarr[] = new int[arr.length];
        // reverse(arr, arr.length - 1, newarr);
        // forReverse(arr);

        // Min and max of an arry
        // int arr[] = { 3, 5, 4, 1, 9 };
        // minMax(arr, 0, 0, 0);
        // forMinMax(arr);

    }
}
