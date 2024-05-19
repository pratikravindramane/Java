package BackTracking;

public class BackTracking {
    public static void permutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(str.substring(0, 0));
        System.out.println(str.substring(0 + 1));
        permutation(str, "");
    }
}
