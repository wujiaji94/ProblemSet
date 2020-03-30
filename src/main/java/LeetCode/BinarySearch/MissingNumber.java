package LeetCode.BinarySearch;

/**
 * @Author: wujiaji
 * @Date: 2020-03-30 20:13
 * @Description: 面试题53 - II. 0～n-1中缺失的数字
 **/
public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(obj.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
