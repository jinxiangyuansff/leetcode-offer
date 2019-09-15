/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {

         ListNode node =new ListNode(-1);

         node.next=head;

         ListNode pre =node;

         while(pre.next!=null&&pre.next.next!=null)
         {  
           ListNode l1 = pre.next;
           ListNode l2=pre.next.next;
           ListNode next=l2.next;
           l1.next=next;
           l2.next=l1;
           pre.next=l2;
           pre=l1;

         }
        return node.next;
       
          
    }
}

