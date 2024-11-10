package Strings;

import java.util.ArrayList;

public class ChartoNum {

    public static ArrayList<String> Decode(String str) {
        String newStr = new String();
        ArrayList<String> arr = new ArrayList<>();
        char same = str.charAt(0);
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + same);
            if (str.charAt(i) == same) {
                newStr += str.charAt(i);
            } else {
                // System.out.println(newStr);
                arr.add(newStr.toString());
                newStr = "" + str.charAt(i);
                same = str.charAt(i);
            }
        }
        System.out.println(arr);
        return arr;
    }

    public static String printSequence(String[] str, String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                output += '0';
            else {
                int index = input.charAt(i) - 'A';
                output += str[index];
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String str[] = { "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };
        System.out.println(printSequence(str, "HELLO WORLD"));

    }
}
