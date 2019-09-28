/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
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
//
class Solution {
    private int sum;
    public TreeNode convertBST(TreeNode root) {
      
         travel(root);
         return root;
    }

    private void travel(TreeNode node)
    {
         if(node==null)return ;
        travel(node.right);
        sum+=node.val;
         node.val=sum;
         travel(node.left);
 
    }

}

