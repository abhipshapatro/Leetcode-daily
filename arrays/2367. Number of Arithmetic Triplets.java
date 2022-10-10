import java.util.*;
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet <>();
        int count = 0;
        
        for(int i = 0; i < nums.length ; i++)
            set.add(nums[i]);
        
        for(int i = 0; i < nums.length ; i++){
            if(set.contains(nums[i] + diff) && set.contains(nums[i] - diff))
                count++;
        }
        return count;
    }
}