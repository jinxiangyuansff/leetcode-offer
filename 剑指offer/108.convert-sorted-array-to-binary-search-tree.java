/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
//排序数组构建BST
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) 
        {
          return BSTsort(nums, 0, nums.length-1);
        
        }

   private TreeNode  BSTsort(int[] nums,int index,int end)
   {     if(index>end)return null;
        int mid =(index+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=BSTsort(nums, index, mid-1);
        root.right=BSTsort(nums, mid+1, end);
        return root;
   }
}

