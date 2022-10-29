import java.util.*;
class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int i = 0, j = 0; // i - loop ctrl variable
        int roomCount = 0;
        Collections.sort(arrive);
        Collections.sort(depart);
        for(i = 0; i < arrive.size(); i++){
            if(arrive.get(i) <= depart.get(j))
                roomCount++;
            else
                j++;
        }
        return roomCount <= K;
    }
}
