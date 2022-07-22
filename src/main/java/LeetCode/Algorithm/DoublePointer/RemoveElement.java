package LeetCode.Algorithm.DoublePointer;

/**
 * @Author: wujiaji
 * @Date: 2020-04-07 18:38
 * @Description: 27. 移除元素
 * @URL: //https://leetcode-cn.com/problems/remove-element/
 **/
public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(obj.removeElement(nums, val));
    }
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
