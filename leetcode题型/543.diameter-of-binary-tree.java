/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
      private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
        
    }

    private int depth(TreeNode root)
    {   if(root==null) return 0;
        int leftdepth = depth(root.left);
        int rightdepth = depth(root.right);
        max =Math.max(max,leftdepth+rightdepth);
        return Math.max(leftdepth,rightdepth)+1;
    }
}

