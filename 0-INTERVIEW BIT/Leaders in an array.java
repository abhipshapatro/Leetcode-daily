import java.util.*;
 public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        for(int i = A.size()-1 ; i>=0; i--){
            if(A.get(i) > max){
                ans.add(A.get(i));
                max = A.get(i);
            }
        }
        return ans;
    }
}
