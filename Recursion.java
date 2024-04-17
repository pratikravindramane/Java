public class Recursion {
    public static void PrintSum(int i, int n, int f) {
        if (i == n) {
            f += i;
            System.out.println(f);
            return;
        }
        f += i;
        PrintSum(i + 1, n, f);
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_1 = Factorial(n - 1);
        int fact = n * fact_1;
        return fact;
    }

    // fibonachi series
    public static void fibonachi(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonachi(b, c, n - 1);
    }

    public static int toThePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = toThePower(x, n - 1);
        int xpown = x * xPownm1;
        return xpown;
    }

    public static void main(String arr[]) {
        // PrintSum(1, 4, 1);
        // System.out.println(Factorial(4));
        // fibonachi(0, 1, 7);

        // print x^n\
        System.out.println(toThePower(5, 3));

    }
}
