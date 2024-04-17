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
            System.out.print(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s, i - 1);
    }

    public static void fAndL(String str, String e, int idx) {

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
        // System.out.println(palindrome("mom"));

        // reverse String
        // String s = "abcd";
        // reverse(s, s.length() - 1);

        // first and last accourance of a element in string
        String str = "aabbcdadbda";
        fAndL(str, "a", 0);

    }
}