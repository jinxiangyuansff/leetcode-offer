

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
         return isOk(root.left, root.right);
    }

    private boolean isOk(TreeNode a, TreeNode b)
    {
          if(a==null&&b==null)return true;
          if(a==null||b==null)return false;
          if(a.val!=b.val)return false;

          return isOk(a.left, b.right)&&isOk(a.right, b.left);

    }
}

