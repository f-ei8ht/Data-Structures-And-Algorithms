package ValidAnagrams;

import java.util.*;

public class Brute {
    public static boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String s1 = new String(ch);
        char[] dh = t.toCharArray();
        Arrays.sort(dh);
        String t1 = new String(dh);

        return s1.equals(t1) ? true : false;

    }
}
