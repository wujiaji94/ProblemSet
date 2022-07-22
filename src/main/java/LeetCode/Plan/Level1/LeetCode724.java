package LeetCode.Plan.Level1;

/**
 * 724. 寻找数组的中心下标
 *
 * @Author: wujiaji
 * @Date: 2022-07-22
 **/
public class LeetCode724 {
    // 输入：nums = [1, 7, 3, 6, 5, 6]
    // 输出：3
    public int pivotIndex(int[] nums) {
        int left = 0;
        // left[i] = left[i - 1] + nums[i - 1];
        // left[i] + right[i] + nums[i] = sum
        // left[i] = right[i]
        // ==> 2*left[i] == sum - nums[i]
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (2*left == sum - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
