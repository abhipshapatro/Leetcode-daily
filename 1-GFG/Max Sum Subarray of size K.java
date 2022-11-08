import java.util.*;
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i = 0;//loop ctrl
        int j = 0;//sliding
        long sum = 0, max = Integer.MIN_VALUE;
        while(i < N){
            sum += Arr.get(i);
            if(i-j+1 == K){
                max = Math.max(max, sum);
                sum -= Arr.get(j); //subtract the first element out of the two elements
                j++;
            }
            i++;
        }
        
        return max;
    }
}