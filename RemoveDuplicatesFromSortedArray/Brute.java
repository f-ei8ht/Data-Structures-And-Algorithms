package RemoveDuplicatesFromSortedArray;

public class Brute {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}
