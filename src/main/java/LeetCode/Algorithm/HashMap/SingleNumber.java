package LeetCode.Algorithm.HashMap;

import java.util.HashMap;

/**
 * @Author: wujiaji
 * @Date: 2020-04-03 19:32
 * @Description: 136. 只出现一次的数字
 * @URL: //https://leetcode-cn.com/problems/single-number/
 **/
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
//        int[] nums = {4, 1, 2, 1, 2};
        int[] nums = {2, 2, 1};
        System.out.println(obj.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], -1);
                continue;
            }
            hashMap.put(nums[i], i);
        }

        for (Integer value : hashMap.values()) {
            if (value != -1) {
                return nums[value];
            }
        }
        throw new IllegalArgumentException("no solutions");
    }
}
