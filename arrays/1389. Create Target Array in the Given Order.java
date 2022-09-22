import java.util.*;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int i = 0;
        ArrayList<Integer> element = new ArrayList<Integer>();
        int[] target = new int [nums.length];

        while (i<nums.length) {
            element.add(index[i],nums[i]);
            i++;
        }
        for (int j = 0; j < element.size(); j++) {
            target[j] = element.get(j);
            
        }
        return target;
    }
}
