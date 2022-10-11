class Solution {
    public int maxProductDifference(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        
        for(int i = 0 ;i < nums.length ; i++){
            
            if(max1 < nums[i]){
                max2 = max1;
                max1 = nums[i];   
            }
            else if(max2 < nums[i])
                max2 = nums[i];
            
            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }
            else if(min2 > nums[i])
                min2 = nums[i];
        }
        
        return (max1*max2) - (min1*min2);
    }
}
