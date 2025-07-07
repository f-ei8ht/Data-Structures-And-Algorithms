package inSubsequence;

public class InSub {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(i)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}