package FindNumbersWithEvenNumberOfDigits;

public class Brute {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int result = (int) (Math.log10(nums[i])) + 1;
            if (result % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}