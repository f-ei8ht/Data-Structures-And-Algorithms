package PerfectNumber;

public class Brute {
    public static boolean findAllDivisors(int num) {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                if ((num / i) != i) {
                    sum = sum + (num / i);
                }
            }
        }
        return sum - num == num ? true : false;
    }
}