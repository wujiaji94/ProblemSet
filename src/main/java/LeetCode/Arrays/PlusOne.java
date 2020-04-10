package LeetCode.Arrays;

/**
 * @Author: wujiaji
 * @Date: 2020-04-10 19:39
 * @Description: 66. 加一
 * @URL: //https://leetcode-cn.com/problems/plus-one/
 **/
public class PlusOne {
    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[] digits = {4, 3, 2, 1};
        digits = obj.plusOne(digits);
        for (int i : digits) {
            System.out.print(i);
        }
    }

    public int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length + 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = digits[i - 1];
        }
        int cur = arr.length - 1;
        arr[cur]++;
        while (arr[cur] == 10) {
            arr[cur] = 0;
            arr[--cur]++;
        }

        if (arr[0] != 0) {
            return arr;
        } else {
            for (int i = 0; i < digits.length; i++) {
                digits[i] = arr[i + 1];
            }
            return digits;
        }
    }
}
