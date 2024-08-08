package com.example.myproject.service;

import com.example.myproject.util.TimeUtilsClock;
import org.springframework.stereotype.Service;
import com.example.myproject.exception.InvalidTimeFormatException;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Service
public class TimeServiceClock {

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public String getCurrentTimeInWords() {
        LocalTime currentTime = LocalTime.now();
        return convertTimeToWords(currentTime.format(TIME_FORMATTER));
    }

    public String convertTimeToWords(String time) {

        try {
            LocalTime.parse(time, TIME_FORMATTER); // Validate time format
        } catch (DateTimeParseException e) {
            throw new InvalidTimeFormatException("Invalid time format"); // Throw custom exception
        }

        if ("12:00".equals(time)) {
            return "It's Midday";
        } else if ("00:00".equals(time)) {
            return "It's Midnight";
        } else {
            return "It's " + TimeUtilsClock.convertTimeToWords(time);
        }
    }
}
