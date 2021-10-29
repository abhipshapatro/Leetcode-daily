class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        int zeroes = 0;
        int index = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroes++;
                index = i;
            }
        }
        
        if(zeroes > 1){
            return ans;
        }
        
        else if(zeroes == 1){
            int prod = 1;
            
            for(int i=0; i<index; i++)
                prod *= nums[i];
            
            for(int i=index+1; i<nums.length; i++)
                prod *= nums[i];
            
            ans[index] = prod;
            return ans;
        }
        
        else{
            ans[0] = nums[0];
            
            for(int i=1; i<nums.length; i++)
                ans[i] = nums[i]*ans[i-1];
            
            ans[ans.length-1] = ans[ans.length-2];
            
            int prod = nums[nums.length-1];
            
            for(int i=nums.length-2; i>0; i--){
                ans[i] = ans[i-1] * prod;
                prod *= nums[i];
            }
            ans[0] = prod;
        }
        return ans;
    }
}