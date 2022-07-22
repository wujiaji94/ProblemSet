package LeetCode.Algorithm.Traverse;

import LeetCode.Algorithm.Node.TreeNode;

import java.util.Arrays;

/**
 * @Author: wujiaji
 * @Date: 2020-03-30 20:06
 * @Description: 面试题 04.02. 最小高度树
 * @URL: //https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 **/
public class SortedArrayToBST {
    public static void main(String[] args) {
        SortedArrayToBST obj = new SortedArrayToBST();
        int[] nums = {-10, -3, 0, 5, 9};
        obj.sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int m = nums.length / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, m));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, m + 1, nums.length));
        return root;
    }
}
