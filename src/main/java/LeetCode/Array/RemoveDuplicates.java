package LeetCode.Array;

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
        for (int n: nums) {
            System.out.print(n + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int left = 0;
        int right = 0;
        int count = 0;
        while (left != nums.length - 1) {
            while (nums[left] == nums[right]) {
                if (right == nums.length - 1) {
                    break;
                } else {
                    right++;
                }
            }
            nums[count++] = nums[left];
            if (right == nums.length - 1 && nums[left] != nums[right]) {
                nums[count++] = nums[right];
            }
            left = right;
        }

        return count;
    }
}
