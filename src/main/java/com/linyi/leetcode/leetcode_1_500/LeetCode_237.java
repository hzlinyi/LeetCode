package com.linyi.leetcode.leetcode_1_500;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: linyi01666
 * @Time: 上午10:31 2020/6/29
 * @Modify:
 * @Description: leetcode 237
 * @题目：
 *      请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *      现有一个链表 -- head = [4,5,1,9]，它可以表示为:4->5->1->9
 *   ps:链表至少包含两个节点。
 *      链表中所有节点的值都是唯一的。
 *      给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 *      不要从你的函数中返回任何结果。
 * @Case：输入: head = [4,5,1,9], node = 5
 *        输出: [4,1,9]
 *        解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LeetCode_237 {
    public void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
