class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int totalSum = len*(len+1) / 2;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++)
            sum += nums[i];
        
        return totalSum - sum;
    }
}
