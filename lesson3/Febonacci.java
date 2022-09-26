package lesson3;

public class Febonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(2));
        System.out.println(fibNaive(3));
        System.out.println(fibNaive(1));

        System.out.println(fibEffective(100));
    }

    public static long fibNaive(int n) {
        if (n <= 1)
            return n;
        else
            return fibNaive(n-1) + fibNaive(n - 2);
    }

    public static long fibEffective(int n) {
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
