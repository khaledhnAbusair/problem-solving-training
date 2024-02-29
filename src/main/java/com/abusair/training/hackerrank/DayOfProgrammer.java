package com.abusair.training.hackerrank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfProgrammer {
    private static final int DAY_OF_YEAR = 256;

    public static String dayOfProgrammer(int year) {

        int[] daysInMonth = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year < 1700 || year > 2700)
            return "Year out of range. Please provide a year between 1700 and 2700.";


        if (year == 1918) {
            // Handling the special case for the transition year 1918
            daysInMonth[1] = 15; // February has 15 days in 1918
        } else if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        } else {
            daysInMonth[1] = 28;
        }

        int totalDays = 0;
        int month = 0;
        for (int d : daysInMonth) {
            totalDays += d;
            month++;

            if (totalDays >= DAY_OF_YEAR)
                break;
        }

        int remainingDays = DAY_OF_YEAR - totalDays;
        for (int j : daysInMonth) {
            if (remainingDays <= j)
                break;
            remainingDays -= j;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date(year - 1900, month, remainingDays); // Year is offset by 1900, month is 0-based

        return sdf.format(date);

    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1700));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1918) {
            // Julian calendar: Leap years are divisible by 4
            return year % 4 == 0;
        } else if (year > 1918) {
            // Gregorian calendar: Leap years are either divisible by 400 or divisible by 4 but not by 100
            return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        } else {
            // Transition year 1918: February 14th was the 32nd day of the year
            return false;
        }
    }
}
