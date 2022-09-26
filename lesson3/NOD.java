package lesson3;

public class NOD {
    public static void main(String[] args) {
        System.out.println(gcd(16, 8));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;

            b = temp;
        }

        return  a;
    }
}

