import java.util.ArrayList;
import java.util.Map;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> frequency = new HashMap<>();
        for(int num :nums)
        {
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets =new ArrayList[nums.length+1];

        for(int key: frequency.keySet())
        {
            int frequent = frequency.get(key);
            if(buckets[frequent]==null)
            {
                buckets[frequent] = new ArrayList<>();
            }
        
        
                buckets[frequent].add(key);
           

        }

        List<Integer> topK = new ArrayList<>();
    for (int i = buckets.length - 1; i >= 0 && topK.size() < k; i--) {
        if (buckets[i] == null) {
            continue;
        }
        if (buckets[i].size() <= (k - topK.size())) {
            topK.addAll(buckets[i]);
        } else {
            topK.addAll(buckets[i].subList(0, k - topK.size()));
        }
    }
    return topK;

    }
}

