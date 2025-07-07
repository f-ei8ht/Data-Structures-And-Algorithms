package Rotate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate {
    public static void rotate(int[] nums, int k) {

    }

    public static int[] reverse(int[] nums) {
        int n;

        if(nums.length % 2 == 0) {
            n = nums.length / 2;
        } else {
            n = nums.length / 2  + 1;
        }

        for(int i = 0; i < n; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] r = reverse(new int[]{1,2,3,4,5,6,7});
        System.out.println(Arrays.toString(r));
        rotate(r, 3);
    }
}
