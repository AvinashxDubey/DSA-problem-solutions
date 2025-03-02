package org.practice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    //Given an m x n matrix, return all elements of the matrix in spiral order.
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            //for top row
            for(int i=left; i<=right; i++)
                list.add(matrix[top][i]);
            top++;

            //for right column
            for(int i=top; i<=bottom; i++)
                list.add(matrix[i][right]);
            right--;

            //for bottom row
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }
            //for left column
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = spiralOrder(new int[][] {{1}, {2}, {3}});
        System.out.println(list1);
        List<Integer> list2 = spiralOrder(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
        System.out.println(list2);
    }
}
