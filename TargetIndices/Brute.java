package TargetIndices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Brute {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
