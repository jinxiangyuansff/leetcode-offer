import java.util.List;
import java.util.Stack;
/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
//中序遍历流程-递归形式:dfs(root.left);visit(root);dfs(root.right);
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> ret =new ArrayList<>();
      Stack<TreeNode> stack =new Stack<>();
      TreeNode cur=root;
       while(cur!=null||!stack.isEmpty())
       {
          while(cur!=null)
          {
              stack.push(cur);
              cur=cur.left;
          }
           TreeNode node = stack.pop();
           ret.add(node.val);
           cur=node.right;
       }
        

          return ret;

    }
}

