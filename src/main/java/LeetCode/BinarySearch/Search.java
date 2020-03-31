package LeetCode.BinarySearch;

/**
 * @Author: wujiaji
 * @Date: 2020-03-31 20:16
 * @Description: 面试题53 - I. 在排序数组中查找数字 I
 **/
public class Search {
    public static void main(String[] args) {
        Search obj = new Search();
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(obj.search(nums, 8));
    }

    public int search(int[] nums, int target) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        while (left < nums.length && nums[left++] == target) {
            count++;
        }
        return count;
    }
}
