package LeetCode.Collections.List.LinkedList;

import LeetCode.Node.ListNode;

/**
 * @Author: wujiaji
 * @Date: 2020-04-09 20:03
 * @Description: 21. 合并两个有序链表
 * @URL: //https://leetcode-cn.com/problems/merge-two-sorted-lists/
 **/
public class MergeTwoLists {
    public static void main(String[] args) {
        MergeTwoLists obj = new MergeTwoLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = obj.mergeTwoLists(l1, l2);
        while (l3.next != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    /**
     * @param l1 the first input ListNode
     * @param l2 the second input ListNode
     * @return ListNode
     **/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
