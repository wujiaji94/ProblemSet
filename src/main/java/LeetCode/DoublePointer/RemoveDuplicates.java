package LeetCode.DoublePointer;

/**
 * @Author: wujiaji
 * @Date: 2020-04-02 19:42
 * @Description: 26. 删除排序数组中的重复项
 * @URL: //https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 **/
public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(obj.removeDuplicates(nums));
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return nums.length;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}

