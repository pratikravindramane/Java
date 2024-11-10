package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class CountDuplicates {
    public static void main(String[] args) {
        HashMap<Character, Integer> result = new HashMap<>();
        String input = "geeksforgeeks";
        char[] c = input.toCharArray();
        Arrays.sort(c);
        char same = c[0];
        int count = 1;
        for (int i = 1; i < c.length; i++) {
            if (c[i] == same) {
                count++;
            } else {
                if (count > 1)
                    result.put(same, count);
                count = 1;
                same = c[i];

            }
        }
        if (count > 1)
            result.put(same, count);
        System.out.println(result);
    }
}
