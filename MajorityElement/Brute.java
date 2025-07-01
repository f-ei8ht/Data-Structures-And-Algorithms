package MajorityElement;

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majority) {
                return nums[i];
            }
        }
        return -1; // This line won't be reached if majority element is guaranteed
    }
}
