package pow;

public class Brute {
    public static double myPow(double x, int n) {
        double p = 1.0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                p = p * x;
            }
        } else {
            for (int i = 1; i <= Math.abs(n); i++) {
                p = p * 1 / x;
            }
        }
        return p;
    }
}
