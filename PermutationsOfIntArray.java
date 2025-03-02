package org.practice;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfIntArray {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
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
                List<List<Integer>> perms = permute(remNums);
                for(List<Integer> p : perms){
                    p.add(n);
                }

                res.addAll(perms);
            }
            return res;
        }

    }
}
