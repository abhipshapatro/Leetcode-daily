import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> result = new ArrayList<>();
        
        int indexWithMaxCandy = maxCandy(candies);
        for( int i = 0 ; i < candies.length; i++){
            if(candies[i] + extraCandies >= indexWithMaxCandy)
                result.add(true);
            else
                result.add(false);
        }
        
        return result;
    }
    public int maxCandy(int[] candies){
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < candies.length; i++)
            max =  Math.max(max, candies[i] );
        
        return max;
    }
}