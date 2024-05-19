package Sorting;
import java.util.*;

class sorting {
    public static void Print(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // bubble techniques
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // selection sorgin
        // int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int sml = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[sml] > arr[j]) {
                    // swap
                    sml = j;
                }
            }
            int temp = arr[sml];
            arr[sml] = arr[i];
            arr[i] = temp;
        }

        // insertion
        // int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current > arr[j]) { // for ascending current<arr[j]
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        Print(arr);
    }

}