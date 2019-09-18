import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;



/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
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
//后序遍历-递归形式： dfs(root.left);dfs(root.right);visit(root)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
            stack.add(root);
            while(!stack.isEmpty())
            {
                TreeNode a=stack.pop();
                if(a==null)continue;
                if(a.left!=null)stack.push(a.left);
                if(a.right!=null)stack.push(a.right);
                ret.add(a.val);
            }  
         
        Collections.reverse(ret);
        return ret;


    }
}

