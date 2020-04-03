package LeetCode.HashMap;

import java.util.HashMap;

/**
 * @Author: wujiaji
 * @Date: 2020-04-03 19:35
 * @Description: 202. 快乐数
 * @URL: //https://leetcode-cn.com/problems/happy-number/
 **/
public class IsHappy {
    public static void main(String[] args) {
        IsHappy obj = new IsHappy();
        System.out.println(obj.isHappy(19));
    }
    public boolean isHappy(int num) {
        long start = System.currentTimeMillis();
        int temp = num;
        while (temp != 1) {
            long end = System.currentTimeMillis();
            if (end - start > 0.03) {
                return false;
            }

            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int count = 0;
            while (temp != 0) {
                int key = temp % 10;
                hashMap.put(count, key * key);
                count++;
                temp /= 10;
            }

            for (Integer value : hashMap.values()) {
                temp += value;
            }
        }
        return true;
    }
}
