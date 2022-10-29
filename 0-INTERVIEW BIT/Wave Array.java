import java.util.*;
class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i = 0; i < A.length - 1; i+=2){
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;
        }
        return A;
    }
}

//arraylist
// public class Solution {
//     public ArrayList<Integer> wave(ArrayList<Integer> A) {
//         //corner case
//         if(A.size() == 1)
//         return A;
//         Collections.sort(A);
//         for(int i = 0 ; i < A.size() - 1 ; i+=2){
//             Collections.swap(A, i, i+1);
//         }
//         return A;
//     }
// }
