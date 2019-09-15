/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null)return false;
         return isSubtreewithroot(s, t)||isSubtree(s.left, t)||isSubtree(s.right, t);
    }

    private boolean isSubtreewithroot(TreeNode s,TreeNode t)
    {
        if(s==null&&t==null)return true;
        if(s==null||t==null)return false;
        if(s.val!=t.val)return false;
        return isSubtreewithroot(s.left, t.left)&&isSubtreewithroot(s.right, t.right);


    }
}

