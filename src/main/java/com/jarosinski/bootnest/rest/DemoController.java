package com.jarosinski.bootnest.rest;

import com.jarosinski.bootnest.coach.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/daily-workout") // http://localhost:8080/daily-workout");
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
