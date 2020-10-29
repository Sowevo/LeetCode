package com.sowevo.leetcode.editor.cn;
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表 
// 👍 1347 👎 0


import com.sowevo.leetcode.editor.cn.AddTwoNumbers.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedLists{
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> r = node2Integers(l1);
        r.addAll(node2Integers(l2));
        r=r.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        ListNode temp = null;
        for (Integer integer : r) {
            temp = new ListNode(integer,temp);
        }
        return temp;
    }
    public List<Integer> node2Integers(ListNode l){
        List r = new ArrayList();
        if (l==null){
            return r;
        }
        while (true){
            r.add(l.val);
            if(l.next==null){
                break;
            }
            l = l.next;
        }
        return r;
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