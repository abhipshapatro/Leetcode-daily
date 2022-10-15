import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        int duplicate = 0;
        for(int i = 0 ;i < nums.length ; i++){
            if(set.contains(nums[i]))
                duplicate = nums[i];
            
            set.add(nums[i]);
        }
        
        int sum = 0;
        for(int i : set){
            sum += i;
        }
        int totalSum = nums.length * (nums.length+1) / 2;
        int missing = totalSum - sum;
        
        return new int[] {duplicate, missing};
        
        
    }
}