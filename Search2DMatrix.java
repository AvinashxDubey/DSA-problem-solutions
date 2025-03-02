package org.practice;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low=0, up= m*n - 1;
        while(low<=up){
            int mid = (up + low)/2;
            int row  = mid/n, col = mid%n;
            if(matrix[row][col]>target){
                up = mid - 1;
            }
            else if(matrix[row][col]==target){
                return true;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}
