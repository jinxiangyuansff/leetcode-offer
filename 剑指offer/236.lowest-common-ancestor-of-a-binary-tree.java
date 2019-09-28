/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
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
//普通二叉树 公共祖先
//思路就是遍历，如果左右同时不为空 即为父类。
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==null||root.val==p.val||root.val==q.val)return root;
       root.left=lowestCommonAncestor(root.left, p, q);
       root.right=lowestCommonAncestor(root.right, p, q);
       return root.left==null? root.right : root.right==null?root.left:root;
        
    }
}
 
