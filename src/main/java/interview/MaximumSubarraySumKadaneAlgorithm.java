package interview;

public class MaximumSubarraySumKadaneAlgorithm {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        var currentSum = nums[0];
        var maxSum = nums[0];

        for (var i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum); // 6
    }
}
