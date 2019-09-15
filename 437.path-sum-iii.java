/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int ret= pathStartroot(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
       return ret;
    }

    private int pathStartroot(TreeNode root,int sum)
    {       if(root==null)return 0;
            int ret = 0;
            if(root.val==sum)ret++;
            ret+=pathStartroot(root.left, sum-root.val)+pathStartroot(root.right, sum-root.val);
          return ret;
        
    }
}

