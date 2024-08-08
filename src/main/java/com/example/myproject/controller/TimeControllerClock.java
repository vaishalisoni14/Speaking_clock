package com.example.myproject.controller;

import com.example.myproject.service.TimeServiceClock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class TimeControllerClock {

    @Autowired
    private TimeServiceClock timeService;

    @GetMapping("/current-time")
    public String getCurrentTime() {
        return timeService.getCurrentTimeInWords();
    }

    @GetMapping("/convert-time")
    public String convertTime(@RequestParam String time) {
        return timeService.convertTimeToWords(time);
    }
}
