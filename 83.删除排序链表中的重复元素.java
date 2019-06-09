/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode s =head;
        ListNode c =head;
        while (c.!= null ) {
            if (c.next.val == c.val) {
                c = c.next;
            }else{
                s.next=c.next
                s=c.next;
                c=c.next;
            }
        }
        if(s!=c){
            s.next=null;
        }
        return head;
    }
}
