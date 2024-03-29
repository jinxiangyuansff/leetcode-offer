/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
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
//找出BST的父类
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root.val<p.val&&root.val<q.val)return lowestCommonAncestor(root.right, p, q);
      if(root.val>p.val&&root.val>q.val)return lowestCommonAncestor(root.left, p, q);
     else  return root;

    }
}

