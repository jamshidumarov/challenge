package DAY1;

public class Problem2396 {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
    }

    public static boolean isStrictlyPalindromic(int n) {
        StringBuilder result = new StringBuilder();
        String reverse;
        int n2;
        for (int i = 2; i <= n - 2; i++) {
            result.setLength(0);
            n2 = n;
            while (n2 >= i) {
                result.append(n2 % i);
                n2 = n2 / i;
            }
            result.append(n2);
            reverse = result.toString();
            result.reverse();
            if (!result.toString().equals(reverse)) return false;
        }
        return true;
    }
}
