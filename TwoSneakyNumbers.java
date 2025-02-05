package org.practice;

import java.util.HashSet;

public class TwoSneakyNumbers {
    public int[] getSneakyNumbers(int[] nums) {
        int[] misc = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                misc[index++]=nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }

        return misc;
    }
}
