package FindTheIndexOfFirstOccurenceInString;

public class Brute {

    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle) != -1 ? haystack.indexOf(needle) : -1;
    }
}