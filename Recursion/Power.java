package Recursion;

public class Power {
    public static int Power1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return Power1(x, n / 2) * Power1(x, n / 2);
        } else {
            return Power1(x, n / 2) * Power1(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int n = 5, x = 2;
        int ans = Power1(x, n);
        System.out.println(ans);
    }
}
