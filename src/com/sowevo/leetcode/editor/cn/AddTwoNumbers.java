package com.sowevo.leetcode.editor.cn;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
// 示例：
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
//
// Related Topics 链表 数学
// 👍 5158 👎 0

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            boolean jinwei = false;
            List<Integer> list= new ArrayList<Integer>();
            while (true){
                int sum = l1.val + l2.val;
                if (jinwei){
                    sum++;
                    jinwei = false;
                }
                if(sum>=10){
                    jinwei = true;
                    sum = sum -10;
                }
                list.add(0,sum);
                if (l1.next==null&&l2.next==null&&!jinwei){
                    break;
                }
                if (l1.next!=null){
                    l1 = l1.next;
                } else {
                    l1 = new ListNode(0);
                }
                if (l2.next!=null){
                    l2 = l2.next;
                } else {
                    l2 = new ListNode(0);
                }
            }
            ListNode temp = null;
            for (Integer integer : list) {
                temp = new ListNode(integer,temp);
            }
            return temp;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}