package Palindrome;

public class Brute {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString()) ? true : false;
    }
}
