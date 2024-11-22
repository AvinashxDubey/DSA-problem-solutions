package org.practice;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        int rev = 0, n=x;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev==x? true : false;
    }

    public static void main(String args[]){
        System.out.println(isPalindrome(121));
    }
}