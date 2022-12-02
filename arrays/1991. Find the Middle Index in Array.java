class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int totalSum = 0, leftSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        
        for(int i = 0;i < nums.length; i++){
            if(2*leftSum == totalSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}