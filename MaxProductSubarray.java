package org.practice;

public class MaxProductSubarray {
    //less optimal perhaps least hehe
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE, prod=1;;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                prod*=nums[j];
                max=Math.max(max, prod);
            }
            prod=1;
        }
        return max;
    }
}
