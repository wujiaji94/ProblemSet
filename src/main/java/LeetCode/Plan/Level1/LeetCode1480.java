package LeetCode.Plan.Level1;

/**
 * 1480. 一维数组的动态和
 *
 * @Author: wujiaji
 * @Date: 2022-07-22
 **/
public class LeetCode1480 {
    //  输入：nums = [1,2,3,4]
    //  输出：[1,3,6,10]
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        return dp;
    }
}
