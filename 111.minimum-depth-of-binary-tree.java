/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
         if(root == null) return 0;
         int left = minDepth(root.left);
         int right = minDepth(root.right);
         if(left==0||right==0)return left+right+1;
         return Math.min(left,right)+1;


    }
}

