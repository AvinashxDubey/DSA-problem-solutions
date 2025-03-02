package org.practice;

public class LengthOfLastWord {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //brute force
    public int lengthOfLastWordB(String s) {
        String[] arr = s.split("\\s+");
        return arr[arr.length-1].length();
    }

    //more optimal
    public static int lengthOfLastWordM(String s) {
        int end=s.length()-1;
        while(end>=0 && s.charAt(end)==' '){
            end--;
        }
        int start = end;
        while(start>=0 && s.charAt(start)!=' '){
            start--;
        }
        return end - start;
    }
}
