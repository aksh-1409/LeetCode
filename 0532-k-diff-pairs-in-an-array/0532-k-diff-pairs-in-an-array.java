import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);  
        int left = 0, right = 1;
        int count = 0;
        int n = nums.length;

        while (left < n && right < n) {
            if (left == right) {
                right++;
                continue;
            }

            int diff = nums[right] - nums[left];

            if (diff == k) {
                count++;
                int leftVal = nums[left];
                int rightVal = nums[right];
                while (left < n && nums[left] == leftVal) 
                left++;
               
                while (right < n && nums[right] == rightVal) 
                right++;
            } 
            else if (diff < k) {
                right++;
            } 
            else { 
                left++;
            }
        }

        return count;
    }
}
