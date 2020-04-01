package LeetCode.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wujiaji
 * @Date: 2020-04-01 20:53
 * @Description: 107. 二叉树的层次遍历 II
 **/
public class LevelOrderBottom {
    public static void main(String[] args) {
        LevelOrderBottom obj = new LevelOrderBottom();

//        TreeNode root = null;
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(obj.levelOrderBottom(root));
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> list = new ArrayList<>();
        list = dfs(root, 0, list);
        Collections.reverse(list);
        return list;
    }

    public List<List<Integer>> dfs(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return null;
        }
        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(root.val);

        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);

        return list;
    }
}
