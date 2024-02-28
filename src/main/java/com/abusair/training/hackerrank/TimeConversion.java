package com.abusair.training.hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public static void main(String[] args) {
        timeConversion("12:00:00AM");
        timeConversionFromInternet("12:00:00AM");
    }

    static String timeConversion(String s) {
        if (s.equalsIgnoreCase("12:00:00AM"))
            return "00:00:00";
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")).toString();
    }

    static void timeConversionFromInternet(String s) {
        String[] tempArray = s.split(":");
        String hours = tempArray[0];
        String minutes = tempArray[1];
        String seconds = tempArray[2].substring(0, 2);

        int tempHours;

        if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
            if (Integer.parseInt(hours) < 12) {
                tempHours = Integer.parseInt(hours);
                tempHours += 12;
                hours = Integer.toString(tempHours);
            }
        }
        if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
            if (Integer.parseInt(hours) == 12) {
                hours = "00";
            }
        }
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
