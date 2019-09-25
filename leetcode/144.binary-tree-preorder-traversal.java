import java.util.ArrayList;
import java.util.Stack;
/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
//前序遍历-递归形式： visit(root); dfs(root.left); dfs(root.right);
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
           TreeNode a =stack.pop();
           if(a==null)continue;
           if(a.right!=null)stack.push(a.right);
           if(a.left!=null)stack.push(a.left);
           ret.add(a.val);
        }

        

        return ret;
    }
}

