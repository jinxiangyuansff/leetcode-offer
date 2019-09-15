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
    private int ret;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(isLeaf(root.left))return root.left.val+sumOfLeftLeaves(root.right);
       return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right); 

        
    }

    private boolean isLeaf(TreeNode root)
    { 
       if(root == null)return false;
       return root.left==null&&root.right==null;
    }

}

