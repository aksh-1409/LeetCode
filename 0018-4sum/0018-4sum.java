class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  
        int n = nums.length;
        long targetLong = (long) target;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;

            long min1 = (long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (min1 > targetLong) 
            break;
            long max1 = (long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3];
            if (max1 < targetLong)
            continue;

            int j = i + 1;
            while (j < n - 2) {   
                if (j > i + 1 && nums[j] == nums[j - 1]) { 
                    j++;
                    continue;
                }

            int left = j + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[j] + nums[left] + nums[right];

                if (sum == targetLong) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) 
                    left++;
                    while (left < right && nums[right] == nums[right - 1])
                     right--;

                    left++;
                    right--;
                } else if (sum < targetLong) {
                    left++;  
                } else {
                    right--; 
                }
            }
            j++;
        }
        }
      return result;   
    }
   
}