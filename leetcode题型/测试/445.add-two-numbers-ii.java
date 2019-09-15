
import java.util.Stack;

/*
 * @lc app=leetcode id=445 lang=java
 *
 * [445] Add Two Numbers II
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          Stack<Integer> a= pushAll(l1);
          Stack<Integer> b=pushAll(l2);
          ListNode result =new ListNode(-1);
          int carry=0; //储存进位
          while(!a.isEmpty()||!b.isEmpty()||carry!=0)
          {
              int x =a.isEmpty() ? 0:a.pop();
              int y=b.isEmpty() ? 0:b.pop();
               int sum=x+y+carry;
               ListNode node =new ListNode(sum%10);
                        node.next=result.next;
                        result.next=node;
                        carry=sum/10;
          }


       return result.next;

    }


    public Stack<Integer> pushAll(ListNode l)
     {
          Stack<Integer> newstack =new Stack<>();

         while(l!=null)
         {
             newstack.push(l.val);
             l=l.next;
         }

         return newstack;
     }
}

