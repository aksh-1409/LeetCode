import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length==1)
        return new ArrayList<>();

        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count = 1;
            int j = i;
            while(j<nums.length-1 && nums[j]==nums[j+1]){
                count++;
                j++;
            }
            i = j;
            if(count==2){
            list.add(nums[i]);
            }
        }
        
    return list;

    }
}