class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even[] = new int[nums.length];
        int odd[] = new int[nums.length];
        int j = 0, k=0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                even[k] = nums[i];
                 k++;
            }
            else{
                odd[j] = nums[i]; 
                j++;
            }   
        }
        for(int i = 0 ; i < k ; i++){
            nums[i] = even[i];
        }
        for(int i = k ; i < nums.length ; i++){
            nums[i] = odd[i-k];
        }
        return nums;
        
    }
}