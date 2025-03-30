package RomanToInteger;

// todo

public class Brute {
    public int romanToInt(String s) {
        int n = 0;
        int i = 0;
        int length = s.length();

        while (i < length) {
            // Check for two-character numerals
            if (i < length - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    n += 4;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    n += 9;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    n += 40;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    n += 90;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    n += 400;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    n += 900;
                    i += 2;
                    continue;
                }
            }

            // Process single-character numerals
            if (s.charAt(i) == 'I') {
                n += 1;
            } else if (s.charAt(i) == 'V') {
                n += 5;
            } else if (s.charAt(i) == 'X') {
                n += 10;
            } else if (s.charAt(i) == 'L') {
                n += 50;
            } else if (s.charAt(i) == 'C') {
                n += 100;
            } else if (s.charAt(i) == 'D') {
                n += 500;
            } else if (s.charAt(i) == 'M') {
                n += 1000;
            }

            i++; // Move to the next character
        }

        return n;
    }
}