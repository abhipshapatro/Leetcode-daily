class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet <Integer>();
        for(int n: nums)
            set.add(n);
        int lenofconsecutiveelems = 0;
        for(int n: nums){
            if(!set.contains(n-1)){
                int currno = n;
                int currlen = 1;
                while(set.contains(currno +1)){
                    currno++;
                    currlen++;
            }
            lenofconsecutiveelems = Math.max(lenofconsecutiveelems,currlen );
        }
    }
    return lenofconsecutiveelems;
    }
}
