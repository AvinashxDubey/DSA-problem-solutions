package org.practice;

public class panagramCheck {
    //a panagram is string which contains all the letter from a to z(here only lowercase) at least once
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(char c='a'; c<='z'; c++){
            if(sentence.indexOf(c)<0){
                return false;
            }
        }
        return true;
    }
}
