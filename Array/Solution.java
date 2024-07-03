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
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr.length - i);
            nArr[arr.length - i-1] = arr[i];
        }
        for (int j = 0; j < nArr.length; j++) {
            System.out.print(nArr[j]);
        }
    }

    public static void main(String arg[]) {
        // Reverse an array
        int arr[] = { 3, 5, 4, 1, 9 };
        int newarr[] = new int[arr.length];
        // reverse(arr, arr.length - 1, newarr);
        forReverse(arr);

        // Min and max of an arry
        // int arr[] = { 3, 5, 4, 1, 9 };
        // minMax(arr, 0, 0, 0);
        // forMinMax(arr);

    }
}
