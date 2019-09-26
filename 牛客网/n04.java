/*
 剑指第四题
 描述：给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 解题思路：
 该二维数组中的一个数，小于它的数一定在其左边，大于它的数一定在其下边。因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间，当前元素的查找区间为左下角的所有元素。
*/

public class n04{

    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0)
            return false;
          int row =array.length,col=array[0].length;
         int r=0,c=col-1;
         while(r<row&&c>=0)
         {
             if(target==array[r][c])
              return true;
             else if(target<array[r][c])
             {
               c--;
                 
             }
             else if(target>array[r][c])
             {
                 r++;
             }
             
         }
         return false;
     }
}