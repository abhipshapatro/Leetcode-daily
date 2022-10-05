class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length -1 ;
        while( i < j ){
            if(nums[i] <= nums[j]){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }   
        }
    }
}
