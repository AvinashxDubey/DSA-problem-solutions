package org.practice;

import java.util.Stack;

public class ValidParentheses {
    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    // determine if the input string is valid.
    //An input string is valid if:
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                brackets.push(ch);
            }
            else{
                if(brackets.isEmpty()){
                    return false;
                }
                char top = brackets.peek();
                if(top == '(' && ch==')'|| top == '{' && ch=='}' || top=='['&& ch==']'){
                    brackets.pop();
                }
                else{
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
