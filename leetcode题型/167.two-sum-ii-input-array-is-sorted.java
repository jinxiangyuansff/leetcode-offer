/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] restult = new int[2];
        int sum=0;
        int first=0;
        int last=numbers.length-1;
        sum=numbers[first]+numbers[last];
        while(sum!=target)
        {  sum=numbers[first]+numbers[last];
           if(sum<target)
            first++;
            else if(sum>target)
            last--;

        }
        restult[0] =first+1;
        restult[1]=last+1;
        return restult;
    }
}

