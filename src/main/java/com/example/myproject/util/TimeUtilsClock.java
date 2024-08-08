package com.example.myproject.util;

public class TimeUtilsClock {

    private static final String[] HOURS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four"
    };

    private static final String[] MINUTES = {
            "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
            "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty",
            "thirty one", "thirty two", "thirty three", "thirty four", "thirty five",
            "thirty six", "thirty seven", "thirty eight", "thirty nine", "forty",
            "forty one", "forty two", "forty three", "forty four", "forty five",
            "forty six", "forty seven", "forty eight", "forty nine", "fifty",
            "fifty one", "fifty two", "fifty three", "fifty four", "fifty five",
            "fifty six", "fifty seven", "fifty eight", "fifty nine"
    };

    public static String convertTimeToWords(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return HOURS[hour] + " " + MINUTES[minute];
    }
}
