package org.practice;

public class DaysBetweenDates {
    public static int daysBetweenDates(String date1, String date2) {
        int day1 = days(date1);
        int day2 = days(date2);
        return Math.abs(day1 - day2);
    }

    static int[] mDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    //days from 1900-1-0
    private static int days(String date){
        String[] ss = date.split("-");
        int yy = Integer.valueOf(ss[0]);
        int mm = Integer.valueOf(ss[1]);
        int dd = Integer.valueOf(ss[2]);
        //this year is active so it is subtracted as well
        int yDelta = yy - 1900 - 1;
        int dy = yDelta * 365 + yDelta/4; //adding leap year extra days as well

        int dm = mDays[mm-1];

        if(isLeap(yy) && mm-1>=2){
            dm++;
        }

        return dy+dm+dd;
    }

    public static boolean isLeap(int yr){
        return (yr%100==0 && yr%400==0) || (yr%100!=0 && yr%4==0);
    }
}
