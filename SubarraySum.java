package org.practice;

public class SubarraySum {
    //less optimal and high complexity
    public int subarraySumL(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }

        }
        return count;
    }
}
