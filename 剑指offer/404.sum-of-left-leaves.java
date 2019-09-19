/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
     
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        if(isleaf(root.left))return root.left.val+sumOfLeftLeaves(root);
       return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
     
    }
   private boolean isleaf(TreeNode root)
   {
      if(root==null)return false;
     return root.left==null&&root.right==null;

   }

}

