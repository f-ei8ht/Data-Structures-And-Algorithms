package ValidPalindrome;

public class Brute {
    public static boolean validPalindrome(String s) {
        String proxyStr = s.toLowerCase();
        String ne = proxyStr.replaceAll("[\\W]+", "");
        StringBuilder reversed = new StringBuilder(ne).reverse();

        // return s.replaceAll("[^A-Za-z0-9]", "");
        // return s.replaceAll("[\\W]+", "");
        return ne.equals(reversed.toString()) ? true : false;
    }
}
