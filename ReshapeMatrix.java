class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        int[][]Reshape = new int[r][c];
         int row = 0;
          int column = 0;
        if(m*n != r*c)return mat;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){

       Reshape[row][column]  = mat[i][j] ;
        column++;

     if(column == c){
        row++;
        column =0;
     }

            }
        }
        return Reshape;
    }
}
