
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */
class Solution {
    public String frequencySort(String s) {
         
        Map<Character,Integer> frequent =new HashMap<>();

        for(char c:s.toCharArray())
        {
            frequent.put(c,frequent.getOrDefault(c, 0)+1);
        }

        List<Character>[] buckets = new ArrayList[s.length()+1];

        for(char b: frequent.keySet())
         {
             int a =frequent.get(b);

             if(buckets[a]==null)
              buckets[a] =new ArrayList<>();

            buckets[a].add(b);
         }

         StringBuilder str =new StringBuilder();

         for(int i=buckets.length-1;i>=0;i--)
           {
               if(buckets[i]==null)
               continue;
              for(char c:buckets[i])
               for(int j=0;j<i;j++)
               {
                   str.append(c);
               }
           }
          
           

        return str.toString();
    }
}

