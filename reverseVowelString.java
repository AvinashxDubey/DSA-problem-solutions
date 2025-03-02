package org.practice;

public class reverseVowelString{
    public String reverseVowels(String s) {
        int start=0, end=s.length()-1;
        char[] str = s.toCharArray();
        String vowel = "aeiouAEIOU";
        while(start<=end){
            while(start<end && vowel.indexOf(str[start])==-1){
                start++;
            }
            while(start<end && vowel.indexOf(str[end])==-1){
                end--;
            }

            char temp = str[end];
            str[end--] = str[start];
            str[start++] = temp;
        }
        return new String(str);
    }
}
