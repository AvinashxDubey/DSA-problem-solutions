package org.practice;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
    //less optimal
    public static int longestConsecutiveL(int[] nums) {
        int maxStreak = 0;
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int currentStreak=1;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int currentElement = nums[i];
                currentStreak = 1;
                while(set.contains(currentElement+1)){
                    currentElement++;
                    currentStreak++;
                }
            }
            maxStreak = Math.max(currentStreak, maxStreak);
        }

        return maxStreak;
    }
    //more optimal
    public int longestConsecutiveM(int[] nums) {
        int count=1, maxStreak = 0;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    count++;
                }
                else{
                    maxStreak = Math.max(count, maxStreak);
                    count=1;
                }
            }
        }

        return Math.max(count, maxStreak);
    }
}
