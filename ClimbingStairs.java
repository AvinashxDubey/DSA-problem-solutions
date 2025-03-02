package org.practice;

public class ClimbingStairs {
    //You are climbing a staircase. It takes n steps to reach the top.
    //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top
    //brute force (doesn't work efficiently for bigger inputs)
    public static int climbStairsB(int n){
        if(n==0 || n==1){
            return 1;
        }
        return climbStairsB(n-1) + climbStairsB(n-2);
    }
    //optimal solution (this is a dynamic programming solution)
    public static int climbStairsM(int n) {
        if(n<=3) return n;
        //prev1 is the no of step to reach n-1 step and prev2 to reach n-2 step
        int prev1 = 3, prev2 = 2, cur=0;
        for(int i=3; i<n; i++){
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }
}
