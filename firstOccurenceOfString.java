package org.practice;

public class firstOccurenceOfString {
    //Given two strings needle and haystack,
    // return the index of the first occurrence of needle in haystack,
    // or -1 if needle is not part of haystack
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {   //slicing
                return i;
            }
        }
        return -1;
    }
}
