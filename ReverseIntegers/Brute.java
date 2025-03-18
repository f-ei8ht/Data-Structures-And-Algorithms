package ReverseIntegers;

// I extracted sign here and worked on the absolute value 

public class Brute {
    public static int reverse(int x) {
        int sign = (x < 0) ? -1 : 1; // extract sign using this
        int a = Math.abs(x);
        int rev = 0;
        while (a > 0) {
            // Todo
            if (rev > (Integer.MAX_VALUE - (a % 10)) / 10) {
                return 0; // Overflow detected
            }
            rev = rev * 10 + a % 10;
            a = a / 10;
        }
        return sign * rev;
    }
}
