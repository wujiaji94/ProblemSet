package LeetCode.Traverse;

/**
 * @Author: wujiaji
 * @Date: 2020-04-02 19:25
 * @Description: 101. 对称二叉树
 * @URL: //https://leetcode-cn.com/problems/symmetric-tree/
 **/
public class IsSymmetric {
    public static void main(String[] args) {
        IsSymmetric obj = new IsSymmetric();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(obj.isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
        return false;
    }
}

