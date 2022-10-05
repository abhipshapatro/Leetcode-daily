class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length -1 ;
        int nz = 0;
        while( i < j ){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[nz];
                nums[nz]=temp;
                nz++;
                i++;
            }
            else if(nums[i]==2){
                int temp1=nums[i];
                nums[i]=nums[j];
                nums[j]=temp1;
                j--;
            }
            else{
                i++;
            }
        }
    }
}