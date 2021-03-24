package com.exadel.task1.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/current")
    public TimeResponse getCurrentTime() {
        return new TimeResponse(counter.incrementAndGet(), LocalTime.now().toString());
    }
}
