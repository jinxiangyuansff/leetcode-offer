/*
 * @lc app=leetcode id=725 lang=java
 *
 * [725] Split Linked List in Parts
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//分割链表
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int N=0;
        ListNode cur = root;
        while(cur!=null)
        {
            N++;
            cur=cur.next;
        }
       cur = root;
       int mod = N%k;
       int Size=N/k;

       ListNode[] ret =new ListNode[k];

       for(int i=0;i<k&&cur!=null;i++)
        {
            ret[i]=cur;
            int curSize=Size+(mod-->0?1:0);
            for(int j=0;j<curSize-1;j++)
             cur=cur.next;

             ListNode next=cur.next;
                cur.next=null;
                 cur=next;
                 
        }

       return ret;

    }
}

