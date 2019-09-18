import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
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
//基于BFS进行遍历
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ret =new ArrayList<>();
        if(root==null)return ret;
        Queue<TreeNode> queue =new LinkedList<>();
          queue.add(root);
          while(!queue.isEmpty())
          {   Double sum=0.0;
              int cnt =queue.size();
              for(int i=0;i<cnt;i++)
              {
                      TreeNode node=queue.poll();
                       sum+=node.val;
                       if(node.left !=null)queue.add(node.left);
                       if(node.right !=null)queue.add(node.right);
              }
            ret.add(sum/cnt);
          }
        return ret;
    }
}

