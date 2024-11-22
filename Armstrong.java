package org.practice;

public class Armstrong {
    public static boolean isArmstrong(int num)
    {
        // write your code here;
        int n = num, arm = 0;
        //finding length of num
        int len = (num==0) ? 1 : (int)Math.floor(Math.log10(n))+1;
        while(n>0){
            int rem = n%10;
            arm += Math.pow(rem, len);
            n/=10;
        }
        return arm==num;
    }

    public static void main(String args[]){
        System.out.println(isArmstrong(153));
    }
}
