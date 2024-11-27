public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 10;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentNum = arr[left] + arr[right];
            if (currentNum == k) {
                System.out.println(arr[left] + " " + arr[right] + " = " + k);
                return;
            } else if (currentNum < k)
                left++;
            else
                right--;
        }

    }
}
