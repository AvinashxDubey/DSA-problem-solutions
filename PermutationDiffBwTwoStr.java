package org.practice;

public class PermutationDiffBwTwoStr {
    //You are given two strings s and t such that every character occurs
    // at most once in s and t is a permutation of s.
    //The permutation difference between s and t is defined as the sum of
    // the absolute difference between the index of the occurrence of each character
    // in s and the index of the occurrence of the same character in t.
    //Return the permutation difference between s and t.
    public int findPermutationDifference(String s, String t) {
        int permDiff = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int j = t.indexOf(ch);
            permDiff += Math.abs(i-j);
        }
        return permDiff;
    }
}
