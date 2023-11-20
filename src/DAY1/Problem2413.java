package DAY1;

public class Problem2413 {
    public static void main(String[] args) {
        int i = smallestEvenMultiple(6);
        System.out.println("result: " + i);
    }

    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }
}
