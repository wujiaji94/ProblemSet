package LeetCode.Collections.List.LinkedList;

import LeetCode.Node.ListNode;

/**
 * @Author: wujiaji
 * @Date: 2020-04-09 20:08
 * @Description: 83. 删除排序链表中的重复元素
 * @URL: //https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 **/
public class DeleteDuplicates {
    public static void main(String[] args) {
        DeleteDuplicates obj = new DeleteDuplicates();
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(3);
        obj.deleteDuplicates(node);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     * @param head the head of ListNode
     * @return ListNode
     **/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == cur.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
