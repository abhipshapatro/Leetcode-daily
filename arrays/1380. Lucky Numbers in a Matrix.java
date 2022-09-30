import java.util.*;;
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> rowMin = new ArrayList<Integer>();
        ArrayList<Integer> colMax = new ArrayList<Integer>();
        
        for(int i = 0 ; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for( int j = 0 ; j < matrix[0].length; j++){
                if( min > matrix[i][j] )
                    min = matrix[i][j];
            }
            rowMin.add(min);
        }
         for(int i = 0 ; i < matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for( int j = 0 ; j < matrix.length ; j++){
                if( max < matrix[j][i] )
                    max = matrix[j][i];
            }
            colMax.add(max);
        }
        
         rowMin.retainAll(colMax);
        
        return rowMin;
        
    }
}