class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       
        int matrix[][] = new int[m][n];
        
        for (int[] a : indices) {
            int row = a[0];
            int col = a[1];

            //row increment
            for(int i = 0 ; i < n ; i++){
                matrix[row][i]++;
            }
            //column increment
            for(int i = 0 ; i < m ; i++){
                matrix[i][col]++;
            }
        }
        int odd=0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                
                if (matrix[i][j] % 2 == 1) {
                    odd += 1;
                }
            }
        }
        return odd;

    }
}