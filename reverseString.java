package org.practice;

public class reverseString {
    public static void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start<=end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;  //[l, o , c, k] to [k, c, o, l]
        }
    }
}
