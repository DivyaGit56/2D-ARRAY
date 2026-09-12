class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //Approach 1 : T.C = O(n^2);

         int m = matrix.length;
         int n = matrix[0].length;

        for(int  i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j]  == target){
                    return true;
                }
            }
        }
        return false;

        //Approach 2 : T.C = O(nlogm)
       
       for(int row = 0; row <m; row++){
        int l = 0;
        int h = n-1;

        while(l<=h){
            int mid = l+(h-l)/2;

            if(matrix[row][mid] == target){
                return true;
            }else if( matrix[row][mid]<target){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
       }
        return false;


    // Approach 3 : T.C = O(log(m*n))

    // Treat 2D matrix as 1D and apply binary search whole

    int l = 0;
    int h = m*n-1;

    while(l<=h){
        int mid = l+(h-l)/2;

        // convert 1D index into 2D

        int row = mid/n;
        int col = mid%n;

        if(matrix[row][col] == target){
            return true;
        }else if(matrix[row][col] < target){
            l = mid+1;
        }else{
            h = mid-1;
        }
    }
    return false;
    }
}
