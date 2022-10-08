class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr = new int[2];
        arr[0] = binaryFirstSearch(nums, target);
        arr[1] = binaryLastSearch(nums, target);
        return arr;
    }
    public int binaryFirstSearch(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int index = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            
            if(nums[mid] == target)
                index = mid;
            if(nums[mid] >= target)
                r = mid - 1;
            else l = mid + 1;
                
        }
        return index;
    }
    public int binaryLastSearch(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int index = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            
            if(nums[mid] <= target)
                l = mid + 1;
            else r = mid - 1;
            if(nums[mid] == target)
                index = mid;
            
        }
        return index;
    }
}
