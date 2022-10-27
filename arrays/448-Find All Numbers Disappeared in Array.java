import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Sort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != (index + 1)) {
                list.add(index + 1);
            }
        }
        return list;
    }
    void Sort(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
    }
    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}