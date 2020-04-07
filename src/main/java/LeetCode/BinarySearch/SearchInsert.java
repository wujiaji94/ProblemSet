package LeetCode.BinarySearch;

/**
 * @Author: wujiaji
 * @Date: 2020-04-07 18:39
 * @Description: 35. 搜索插入位置
 * @URL: //https://leetcode-cn.com/problems/search-insert-position/
 **/
public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert obj = new SearchInsert();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(obj.searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            return target <= nums[0] ? 0 : 1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (target <= nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return target <= nums[nums.length - 1] ? left : left + 1;
    }
}
