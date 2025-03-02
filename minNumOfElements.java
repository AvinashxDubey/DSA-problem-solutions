package org.practice;


import java.util.Arrays;
import java.util.Collections;

public class minNumOfElements {
    //given two arrays arr1 and arr2, find min no of elements of arr2 whose sum is equal to sum of arr1, if not return -1
    public static int minNumberOfElements(int[] arr1, int[] arr2){
        int sum1=0, sum2=0, count=0;
        for(int num : arr1){
            sum1+=num;
        }

        Arrays.sort(arr2);
        for(int i=arr2.length-1; i>=0; i--){
            sum2+=arr2[i];
            count++;
            if(sum2>=sum1){
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 7, 8};
        int[] arr2 = {1, 6, 4, 8, 15, 3};
        System.out.println(minNumberOfElements(arr1, arr2));
    }
}
