package org.practice;

public class addDigits {
    public static int addDigits(int num) {
        while(num>=10){
            int sum =0;
            while(num>0){
                sum += num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }

    //more optimal approach O(1)
    public static int optimalAddDigits(int num) {
        if(num==0) return 0;
        int digit = 1 + (num-1) % 9;
        return digit;
    }
}
