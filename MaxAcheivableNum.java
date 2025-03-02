package org.practice;

public class MaxAcheivableNum {
    /*Given two integers, num and t. A number is achievable if it can become equal to num after applying the following operation:
    Increase or decrease the number by 1, and simultaneously increase or decrease num by 1.
    Return the maximum achievable number after applying the operation at most t times.
     */
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2*t;  //for t=2, max = num + 2(for inc of num) + 2(for dec of max)
    }
}
