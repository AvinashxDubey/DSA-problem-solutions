package org.practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinNumGame {
    /*You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided
    to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:
    Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
    Now, first Bob will append the removed element in the array arr, and then Alice does the same.
    The game continues until nums becomes empty.
    Return the resulting array arr
    */
    //more optimal using arrays
    public static int[] numberGameM(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            int temp = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    //less optimal using priority queue
    public static int[] numberGameL(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[nums.length];
        for(int i : nums){
            pq.offer(i);
        }
        for(int i=0; i<arr.length; i+=2){
            arr[i+1] = pq.poll();
            arr[i] = pq.poll();
        }
        return arr;
    }
}
