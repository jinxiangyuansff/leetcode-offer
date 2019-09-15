/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        if (c==0)return true;
        int i=0;
        int j =(int)Math.sqrt(c);
        int sum =i*i+j*j;
        while(i<=j&&j>0)
        {  sum=i*i+j*j;
            if(sum<c)
             i++;
             else if(sum>c)j--;
             else if(sum==c) return true;
        }
        return false;
    }
}

