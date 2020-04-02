package LeetCode.Array;

import java.util.HashMap;

/**
 * @Author: wujiaji
 * @Date: 2020-04-02 19:37
 * @Description: 1. 两数之和
 * @URL: //https://leetcode-cn.com/problems/two-sum/
 **/
public class TwoSum {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] result = obj.twoSum(nums, 9);
        for (int n: result) {
            System.out.print(n + " ");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[]{hashMap.get(nums[i]), i};
            }
            hashMap.put(target - nums[i], i);
        }

        throw new IllegalArgumentException("no solutions");
    }
}
