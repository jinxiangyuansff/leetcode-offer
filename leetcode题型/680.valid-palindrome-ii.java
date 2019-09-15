/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */
class Solution {
    public boolean validPalindrome(String s) {
        boolean flag=false;
        
       for(int i=0,j=s.length()-1;i<=j;i++,j--)
       {
              if(s.charAt(i)!=s.charAt(j)&&flag==false)
              {
                return check(s, i+1, j)||check(s, i, j-1);
              }  
          }

          return true;
    }

    private boolean check(String k,int i,int j)
    {
        while(i<=j)
        {
            if(k.charAt(i)!=k.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}

