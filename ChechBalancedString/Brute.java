package ChechBalancedString;

public class Brute {
    public static boolean isBalanced(String s) {
        int sumEven = 0;
        int sumODD = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + (i - '0');
            } else {
                sumODD = sumODD + (i - '0');
            }
        }
        return sumEven == sumODD ? true : false;
    }
}
