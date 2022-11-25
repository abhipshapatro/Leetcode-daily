import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //main list
        List<List<Integer>> mainlist = new ArrayList<>();
        
        //row
        List<Integer> list1 = new ArrayList<>();
        
        //first row
        list1.add(1);
        mainlist.add(list1);
        
        if(numRows == 1){
            return mainlist;
        }
        
        for(int i = 1; i< numRows; i++){
            
            //for row2 onwards
            List<Integer> list2 = new ArrayList<>();
            
            list2.add(1); //first element
            
            //middle element sum
            for(int j = 1; j < i; j++){
                list2.add( mainlist.get(i-1).get(j) + mainlist.get(i-1).get(j-1) );
            }
            
            list2.add(1); //last element
            
            mainlist.add(list2);    
        }
        
        return mainlist;
    }
}