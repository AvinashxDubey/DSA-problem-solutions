package org.practice;

import java.util.HashMap;

public class firstUniqueChar {
    //to find the first unique character in the string
    //less optimal
    public static int firstUniqCharL(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for(char ch : s.toCharArray()){
            chars.put(ch, chars.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(chars.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    //more optimal
    public static int firstUniqCharM(String s) {
        int ans = Integer.MAX_VALUE;
        for(int c='a'; c<='z'; c++){
            int index = s.indexOf(c);
            if(index!=-1 && index==s.lastIndexOf(c)){
                ans = Math.min(ans, index);
            }
        }
        return ans==Integer.MAX_VALUE? -1 : ans;
    }
}
