package LeetCode.Algorithm.DoublePointer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wujiaji
 * @Date: 2020-03-21
 * @Description: 面试题57 - II. 和为s的连续正数序列
 * @URL: //https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 **/
public class FindContinuousSequence {
    private static final Logger log = LoggerFactory.getLogger(FindContinuousSequence.class);

    public static void main(String[] args) {
        FindContinuousSequence obj = new FindContinuousSequence();
        int[][] a = obj.findContinuousSequence(15);
        for (int[] index : a) {
            Arrays.stream(index).forEach(s -> System.out.print(s + " "));
            log.debug("This is the debug message.");
        }
    }

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1;
        int j = 1;
        int sum = 0;
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int t = i;
                int[] arr = new int[j - i];
                for (int k = 0; k < arr.length; k++, t++) {
                    arr[k] = t;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
