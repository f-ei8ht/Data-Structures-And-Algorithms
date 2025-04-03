package FindNumbersWithEvenNumberOfDigits;

public class Brute {

    public int findNumbers(int[] nums) {
        int how = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            while(n > 0) {
                n = n / 10;
                count = count + 1;
            }
            if(count % 2 == 0) {
                how++;
            }
        }
        return how;
    }
}
