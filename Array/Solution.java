import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        if (arr.length == 0 || m == 0) {
            return 0;
        }
        // sorting the value
        Arrays.sort(arr);
        if (arr.length - 1 < m)
            return -1;
        // getting the maximum min value
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int nextWindow = i + m - 1;
            if (nextWindow >= arr.length)
                break;
            int diff = arr[nextWindow] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }

    public static void permutation(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i]))
                continue;
            tempList.add(nums[i]);
            permutation(result, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String arg[]) {
        // next permutation
        int[] nums = { 3, 2, 1 };
        List<List<Integer>> result = new ArrayList<>();
        int[] newArr = nums.clone();
        Arrays.sort(newArr);
        permutation(result, new ArrayList<>(), newArr);
        int nextPermutation = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).toString().equals(Arrays.toString(nums))) {
                nextPermutation = (i + 1) % result.size(); // Next permutation
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("nextPermutation" + result.get(nextPermutation));
        // Chocolate Distribution Problem
        // int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        // int m = 5;
        // System.out.println(distribution(arr, m));

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
