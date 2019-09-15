/*
 * @lc app=leetcode id=687 lang=java
 *
 * [687] Longest Univalue Path
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
//深度优先遍历
class Solution {
    private int path=0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
         


    }
      
    private int dfs(TreeNode root)
    {
       if(root == null)return 0;
       int left=dfs(root.left);
       int right =dfs(root.right);
       int leftPath = root.left!=null&&root.val==root.left.val? left+1:0;
       int rightPath = root.right!= null &&root.val==root.right.val? right+1 :0;
        path =Math.max(path,leftPath+rightPath);
        return Math.max(leftPath,rightPath);
        
    }

}

