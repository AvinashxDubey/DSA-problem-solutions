package org.practice;

import java.util.Arrays;

class firstAndLastPosInArray{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 7)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return res;
    }

    public static int findFirst(int[] nums,int target){
        int left=0, right=nums.length-1;
        int first =-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(target==nums[mid]){
                first= mid;
                right= mid-1;  //continue checking towards the left
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return first;
    }

    public static int findLast(int[] nums,int target){
        int left=0, right=nums.length-1;
        int last =-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(target==nums[mid]){
                last= mid;
                left= mid+1;  //continue checking towards the right
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return last;
    }
}
