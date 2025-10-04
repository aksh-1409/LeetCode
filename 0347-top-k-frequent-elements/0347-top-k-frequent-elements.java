import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            int count = 1;
            int j = i;
            while(j<nums.length-1 && nums[j]==nums[j+1]){
                count++;
                j++;
            }
            i = j;
            table.put(nums[i],count);
        }
        int[] result = new int[k];
        for (int i = 0,t=0; i < k; i++) {
            Integer maxKey = null;
            int maxValue = Integer.MIN_VALUE;
            for (Integer key : table.keySet()) {
                Integer value = table.get(key);
                if (value > maxValue) {
                    maxValue = value;
                    maxKey = key;
                }
            }
            if (maxKey != null) {
                result[t++] = maxKey;
                table.remove(maxKey);
            } else {
                break; 
            }
        }
        return result;
    }
}

