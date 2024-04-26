import java.util.HashSet;

public class RecursionPract {
    public static void series(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        series(n - 1);
    }

    public static void sum(int x, int n, int sums) {
        if (n == x) {
            sums += n;
            System.out.println(sums);
            return;
        }
        sums += n;
        sum(x, n + 1, sums);
    }

    public static void factorial(int x, int n, int sums) {
        if (n == x) {
            sums *= n;
            System.out.println(sums);
            return;
        }
        sums *= n;
        factorial(x, n + 1, sums);
    }

    public static int factorial_1(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        int fact_1 = factorial_1(x - 1);
        int fact = x * fact_1;
        return fact;

    }

    public static void Fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        Fibonacci(b, c, n - 1);

    }

    public static boolean palindrome(String n) {
        if (n.length() == 0 || n.length() == 1) {
            return true;
        }
        if (n.charAt(0) == n.charAt(n.length() - 1)) {
            return palindrome(n.substring(1, n.length() - 1));
        }
        return false;
    }

    public static void reverse(String s, int i) {
        if (i == 0) {
            System.out.println(s.charAt(i));
            return;
        }
        System.out.println(s.charAt(i));
        reverse(s, i - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void fAndL(String str, char e, int idx) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == e) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        ;
        fAndL(str, e, idx + 1);
    }

    // check sorting by +1 only
    public static boolean ChecSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] + 1 == arr[idx + 1]) {
            return ChecSorted(arr, idx + 1);
        }
        return false;
    }

    // check sorting by ascending order
    public static boolean ChecSorted_1(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return ChecSorted_1(arr, idx + 1);
        }
        return false;
    }

    public static void moveToEnd(String str, int count, String newString, int idx) {
        if (idx == str.length() - 1) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx) == 'x') {
            count += 1;
        } else {
            newString += str.charAt(idx);
        }
        moveToEnd(str, count, newString, idx + 1);
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idc, String newString) {
        if (idc == str.length()) {
            System.out.println(newString);
            return;
        }
        if (map[str.charAt(idc) - 'a'] == false) {
            map[str.charAt(idc) - 'a'] = true;
            newString += str.charAt(idc);
        }
        removeDuplicates(str, idc + 1, newString);
    }

    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }

        char currentChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newString + currentChar, set);

        // or not to be
        subsequences(str, idx + 1, newString, set);
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            System.out.println("---");
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void printPermutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i < str.length();i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newStr, permutation+currentChar);
        }
    }

    public static void main(String args[]) {
        // Print a series of numbers with recursive Java methods
        // series(10);

        // Sum a series of numbers with Java recursion
        // sum(5, 1, 0);

        // Calculate a factorial in Java with recursion
        // factorial(4, 1, 1);
        // System.out.println(factorial_1(4));

        // Print the Fibonacci series with Java and recursion
        // Fibonacci(0, 1, 10);

        // A recursive Java palindrome checker
        // System.out.println(palindrome("mmomm"));

        // reverse String
        // String s = "abcd";
        // reverse(s, s.length() - 1);

        // first and last accourance of a element in string
        // String str = "aabbcdadbda";
        // char a = 'a';
        // fAndL(str, a, 0);

        // check if an array is sorted and it should be increasing
        // int arr[] = { -1, 0, 2, 4, 9, 10 };
        // System.out.println(ChecSorted(arr, 0));
        // System.out.println(ChecSorted_1(arr, 0));

        // move all x at the end of the string
        // moveToEnd("xpwwexxsaxs", 0, "", 0);

        // remove dublicate character from the strng
        // removeDuplicates("asdassdbasaa", 0, "");

        // all possible subsequences of an string
        // HashSet<String> set = new HashSet<String>();
        // subsequences("aaa", 0, "", set);

        // print keyboard combination
        // printComb("23", 0, "");

        // permutation
        printPermutation("abc", "");
    }
}