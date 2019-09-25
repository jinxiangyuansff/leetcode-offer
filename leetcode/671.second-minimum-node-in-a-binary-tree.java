/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
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
//要么0节点 要么2节点
//引入左值右值
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
            if(root==null)return -1;
            if(root.left==null&&root.right==null)return -1;
            int leftval=root.left.val;
            int rightval=root.right.val;
           if(leftval!=-1&&root.val==leftval)leftval=findSecondMinimumValue(root.left);
           if(rightval!=-1&&root.val==rightval)rightval=findSecondMinimumValue(root.right);
           if(leftval==-1&&rightval==-1)return -1;
           if(leftval!=-1&&rightval!=-1)return Math.min(leftval, rightval);
           if(leftval!=-1)return leftval;
           return rightval; 
           

    }
 
}

