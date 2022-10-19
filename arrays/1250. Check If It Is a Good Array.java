class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcdVal = nums[0];
        for(int i = 0 ; i < nums.length; i++){
            gcdVal = gcd(gcdVal, nums[i]);
            if(gcdVal == 1)
                return true;
        }
        return false;
    }
    public int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
}