package LeetCode.DFS;

/**
 * @Author: wujiaji
 * @Date: 2020-03-30 19:44
 * @Description: 面试题55 - I. 二叉树的深度
 **/
public class MaxDepth {
    public static void main(String[] args) {
        MaxDepth obj = new MaxDepth();
        //create tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        //output
        System.out.println(obj.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

