/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */
class Solution {
    public void sortColors(int[] nums) {
        int zero =-1,one = 0,two=nums.length;
      while(one<two)
       {
           if(nums[one]==0)
          {swap(nums, ++zero, one++);}
           else if(nums[one]==2)
           {swap(nums,--two,one);}
           else
           {
               ++one;
           }

       }  


    }

    private void swap(int[] num, int i,int j)
    {
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
    }
}

