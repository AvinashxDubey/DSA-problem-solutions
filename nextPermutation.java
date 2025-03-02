package org.practice;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,3,5,6,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length, i=n-2;
        //finding the pivot from the right side
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //checking if pivot exists from the right side
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse the whole arr if descending order
        //reverse the subarray after the pivot
        reverse(nums, i+1, n-1);
    }
    public static void swap(int[] nums, int i1, int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start <end){
            swap(nums, start++, end--);
        }
    }
}
