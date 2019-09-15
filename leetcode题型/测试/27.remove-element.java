/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int temp;
        int last=nums.length-1;
        int result=0;
        if(nums.length==1&&nums[0]==val)return 0;
        for(int i=0;i<nums.length&&i<last;i++)
        {
            while(nums[last]==val&&last>0)last--;
            if(last==0&&nums[last]==val)return 0;
            if(last<i)break;
            if(nums[i]==val)
             {
                  temp = nums[i];
                  nums[i]=nums[last];
                  nums[last]=temp;
                  if(last==i)break;
             }
            else 
            {
                continue;
            }
        }
        for(int i=0;i<nums.length;i++)
         if(nums[i]!=val)result++;

         return result;


    }
}

 /*
 // 利用双指针 一个指向头部 一个指向尾部 */
 //2 2 3  3