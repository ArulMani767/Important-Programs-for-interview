package interview;

import java.util.Arrays;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        // Once sorted, the majority element (> n/2 occurrences) is always at the middle
        // index
        Arrays.sort(nums);
        var majority = nums[nums.length / 2];

        System.out.println("Majority Element: " + majority); // 2
    }
}
