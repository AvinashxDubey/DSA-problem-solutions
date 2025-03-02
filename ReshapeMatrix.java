package org.practice;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n= mat[0].length;
        //invalid case when no. of element spots arent equal
        if(m*n != r*c){
            return mat;
        }

        int[][] res = new int[r][c];
        int index=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                res[i][j] = mat[index/n][index%n];
                index++;
            }
        }
        return res;
    }
}
