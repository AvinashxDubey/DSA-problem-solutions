package org.practice;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfList {
    //Given an array nums of distinct integers, return all the possible permutations
    //You can return the answer in any order.
    public static void main(String[] args) {
        System.out.println(permuteL(new int[] {1,2,3}));
    }
    //less optimal approach
    public static List<List<Integer>> permuteL(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //for single element in nums
        if(nums.length==1){
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            res.add(singleList);
            return res;
        }

        //for more than one element in nums
        for(int i=0; i<nums.length; i++){
            int n=nums[i];
            int[] remNums = new int[nums.length-1];
            int index=0;
            for(int j=0; j<nums.length; j++){
                if(j!=i){
                    remNums[index++] = nums[j]; //remaining numbers
                }
            }

            //creating a permutation
            List<List<Integer>> perms = permuteL(remNums);
            for(List<Integer> p : perms){
                p.add(n);
            }

            res.addAll(perms);
        }
        return res;
    }
}
