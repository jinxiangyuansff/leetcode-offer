
/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//切成两半 将后半部分反转
// 1 3 
class Solution {
    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
           ListNode slow=head;
           ListNode fast=head.next;
           while(fast!=null&&fast.next!=null)
           {
               slow=slow.next;
               fast=fast.next.next;
           }
       if(fast!=null) slow=slow.next;//此时为偶数节点

           cut(head,slow);

           return isEqual(head, revese(slow)); 

           

        

    }

    private void cut(ListNode head,ListNode node)
    {
        while(head.next!=node)
         head=head.next;

         head.next=null;

    }

    private boolean isEqual(ListNode a,ListNode b)
    {
        while(a!=null&&b!=null)
        {
            if(a.val!=b.val)return false;
            a=a.next;
            b=b.next;
        }

          return true;
    }

    private ListNode revese(ListNode node)
    {
          if(node==null||node.next==null)
          return node;

          ListNode next =node.next;
           ListNode newhead =revese(next);
                next.next=node;
                node.next=null;
               return newhead;
   }



}

