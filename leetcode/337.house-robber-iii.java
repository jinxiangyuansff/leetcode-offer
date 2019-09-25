/*
 * @lc app=leetcode id=337 lang=java
 *
 * [337] House Robber III
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
    public int rob(TreeNode root) {
      if(root==null)return 0;
       int val1=root.val;
       if(root.left!=null)val1+=rob(root.left.left)+rob(root.left.right);
       if(root.right!=null)val1+=rob(root.right.left)+rob(root.right.right);
       int val2=rob(root.left)+rob(root.right);
       return Math.max(val1,val2);   
      
    }
}
//间隔遍历,看清楚递归的顺序.
