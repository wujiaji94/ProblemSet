package LeetCode.Algorithm.DoublePointer;

/**
 * @Author: wujiaji
 * @Date: 2020-04-07 20:08
 * @Description: 53. 最大子序和
 * @URL: //https://leetcode-cn.com/problems/maximum-subarray/
 **/
public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray obj = new MaxSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(obj.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int slow = 0; slow < nums.length; slow++) {
            int sum = 0;
            for (int quick = slow; quick < nums.length; quick++) {
                sum += nums[quick];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
