/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 */
class Solution {
    public String findLongestWord(String s, List<String> d) {
         String longWord="";
        for(String target: d)
        {  int l1=longWord.length(),l2=target.length();
             if(l1>l2||(l1==l2&&longWord.compareTo(target)<0))
             continue;
             else 
             {
                 if(isSubstr(s, target))
                 longWord = target;
             }
        }
        return longWord;

    }

    private boolean isSubstr(String s,String t)
    {  int i=0,j=0;
        while(i<s.length()&&j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            j++;
            i++;
        }
        return j==t.length();

    }
}

