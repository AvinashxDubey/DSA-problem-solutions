package org.practice;

import java.util.Arrays;

public class squaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] sortedSq = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sortedSq[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedSq);
        return sortedSq;
    }
}
