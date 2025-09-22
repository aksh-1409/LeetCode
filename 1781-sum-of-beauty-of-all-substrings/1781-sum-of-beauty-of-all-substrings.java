import java.util.*;

class Solution {
    public int beautySum(String s) {
        int sum=0;

       
        for (int i = 0; i < s.length(); i++) {
        Map<Character, Integer> mp = new HashMap<>();
        
        for (int j = i; j < s.length(); j++) {
        char c = s.charAt(j);
        mp.put(c, mp.getOrDefault(c, 0) + 1);

        int max = Collections.max(mp.values());
        int min = Collections.min(mp.values());
        sum += (max - min);
        }
    }

    return sum;
    }
}