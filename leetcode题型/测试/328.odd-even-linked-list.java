/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode odd =head;
        ListNode even =head.next;
        ListNode evenhead =even;

        while(even!=null&&even.next!=null)
        {
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;

        
    }
}

