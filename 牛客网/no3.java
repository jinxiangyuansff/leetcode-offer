/*
剑指offer 第三题
描述：
Input:
{2, 3, 1, 0, 2, 5}
Output:
2
要求时间复杂度 O(N)，空间复杂度 O(1)。因此不能使用排序的方法，也不能使用额外的标记数组。
对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。
*/
//sdada
public class no3
{
    public boolean duplicate(int[] nums,int length,int [] duplication){
         
        for(int i=0;i<length;i++)
        {
            while(nums[i]!=i)
            {
                if(nums[nums[i]]==nums[i])
                { duplication[0]=nums[i];
                  return true;
                }
                swap(nums,nums[i],i);
            }
        }
       return false;
    }

   private void swap(int[] nums,int i,int j)
   {
       int t=nums[i];
       nums[i]=nums[j];
       nums[j]=t;
       
   }

}