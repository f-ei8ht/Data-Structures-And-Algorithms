package MissingElement;

import java.util.Arrays;

public class Brute {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (i != nums[i])
                return i;
        }
        return 0;
    }
}
