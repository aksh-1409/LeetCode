class Solution {
    public int majorityElement(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     int j=i;
        //     while(j>0 && nums[j-1]>nums[j]){
        //         int temp = nums[j-1];
        //         nums[j-1] = nums[j];
        //         nums[j] = temp;
        //         j--;
        //     }
        // }

       
        // int n= nums.length;
        // n= n/2;
        // int i=1;
        // int currentmax = 1;
        // while(i<nums.length){
        //     if(nums[i-1]==nums[i]){
        //         currentmax++;
        //         i++;
        //     }
        //     else{
        //         if(currentmax>n){
        //             return nums[i-1];
        //         }
        //         currentmax =1;
        //         i++;
        //     }
        // }
        //  if(currentmax>n){
        //             return nums[nums.length - 1];
        //         }
        // return 0;
        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}