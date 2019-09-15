

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
       private boolean result=true;

    public boolean isBalanced(TreeNode root) {
           MaxDepth(root);

           return result; 
    }

    private int MaxDepth(TreeNode a)
    {
        if(a==null)return 0;
        int l1=MaxDepth(a.left);
        int l2=MaxDepth(a.right);
        if(l1<l2-1||l1>l2+1)result = false;
         return Math.max(l1,l2)+1;
    }
}

