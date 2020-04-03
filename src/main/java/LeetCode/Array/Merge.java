package LeetCode.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wujiaji
 * @Date: 2020-03-28
 * @Description: 面试题 10.01. 合并排序的数组
 * @URL: //https://leetcode-cn.com/problems/sorted-merge-lcci/
 **/
public class Merge {
    public static void main(String[] args) {
        Merge obj = new Merge();
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        obj.merge(a, 3, b, 3);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void merge(int[] a, int m, int[] b, int n) {
        int count = 0;
        List<Integer> mergedList = new ArrayList();
        for (int i : a) {
            if (count < m) {
                mergedList.add(i);
            }
            count++;
        }
        count = 0;
        for (int j : b) {
            if (count < n) {
                mergedList.add(j);
            }
            count++;
        }
        Collections.sort(mergedList);
        for (int i = 0; i < m + n; i++) {
            a[i] = mergedList.get(i);
        }
    }
}
