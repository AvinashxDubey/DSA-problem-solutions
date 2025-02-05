package org.practice;

public class UglyNumber {
    //recursive approach
    public boolean isUglyR(int n) {
        if (n <= 0) return false;
        if (n == 1) return true; // Base case
        if (n % 2 == 0) return isUglyR(n / 2);
        if (n % 3 == 0) return isUglyR(n / 3);
        if (n % 5 == 0) return isUglyR(n / 5);
        return false; // If n is not divisible by 2, 3, or 5
    }
    //compact code
    public boolean isUglyC(int n) {
        if(n<=0){
            return false;
        }

        for(int i=2; i<=5; i++){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
    //straight forward clean approach
    public boolean isUglyS(int n) {
        if(n<=0) return false;

        //checking the divisibilites
        while(n%2==0){
            n/=2;
        }

        while(n%3==0){
            n/=3;
        }

        while(n%5==0){
            n/=5;
        }
        return n==1;
    }
}
