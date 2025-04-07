import java.util.Arrays;

public class Brute {
    public static int[] plusOne(int[] digits) {
        int temp = 0;
        int[] newDigits = Arrays.copyOf(digits, digits.length + 1);
        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1 && digits[digits.length - 1] < 9) {
                temp = digits[digits.length - 1];
                temp = temp + 1;
                digits[digits.length - 1] = temp;
                return digits;
            } else if (i == digits.length - 1 && digits[digits.length - 1] == 9) {
                newDigits[newDigits.length - 2] = 1;
                newDigits[newDigits.length - 1] = 0;
                return newDigits;
            }
        }
        return new int[] {};
    }
}
