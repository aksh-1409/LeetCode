class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int xaxis = height.length - 1;
        int water = Integer.MIN_VALUE;
        while(start<end){
            if(height[start]<=height[end]){
              int tempwater = height[start]*xaxis;
               if(water<tempwater){
                water = tempwater;
               }
               start++;
               xaxis--;
            }
            else{
                int tempwater = height[end]*xaxis;
                if(tempwater>water){
                    water = tempwater;
                }
                end--;
                xaxis--;
            }
            
        }
        return water;
    }
}