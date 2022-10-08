class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int new_arr[][] = new int[r][c];
        
        if(m*n == r*c){
            for(int i = 0; i < m ; i++){
                for(int j = 0; j< n; j++){
                    new_arr[row][col] = mat[i][j];
                    col++;
                    
                    if(col == c){
                        col = 0;
                        row++;
                    }
                }
            }
            return new_arr;
        }
        return mat;
    }
}