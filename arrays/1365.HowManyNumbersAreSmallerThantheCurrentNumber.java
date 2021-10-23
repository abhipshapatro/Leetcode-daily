class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int c =0,k=0;
        int result[] = new int[nums.length];
        for(int i = 0;i<nums.length ; i++){
              c=0;
           for(int j = 0;j<nums.length ;j++){
               if(nums[i] > nums[j]){
                   c += 1;
               }
           }
            result[k] = c;
            k++; 
          
        }
        return result;
    }
}