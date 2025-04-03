package KthMissing;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Opt {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }
        for(int same : arr) {
            if(numbers.contains(same)) {
                numbers.remove(Integer.valueOf(same));
            }
        }
        Collections.sort(numbers);
        return numbers.get(k);
    }
}
